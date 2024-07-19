import Service.EmployeeManage;
import Service.EmployeeValidate;
import domain.Contract;
import domain.Employee;
import domain.Position;
import domain.TypeContract;
import util.Mock;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean exit = false;

        while (!exit) {
            System.out.println();
            System.out.println("--------EMPLOYEE SYSTEM V1.0------");
            System.out.println("--------1) Add new employee------");
            System.out.println("------- 2) View msg------");
            System.out.println("------- 3) Math ------");
            System.out.println("------- 0) Exit------");
            System.out.println();


            try {
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        addEmployee(scanner);
                        break;
                    case 2:
                        viewMsg();
                        break;
                    case 3:
                        operation();
                        break;
                    case 0:
                        exit = true;
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }

        }




    }

    private static void addEmployee(Scanner scanner) throws Exception {

        EmployeeValidate employeeValidate = new EmployeeValidate();
        EmployeeManage manage = new EmployeeManage();
        manage.addEmployee(employeeValidate.validate(scanner));
        manage.viewEmployee();
    }

    private static void operation() {
        int rdo = 2 / 0;
    }

    private static void viewMsg() {
        System.out.println("hello!");
    }
}
