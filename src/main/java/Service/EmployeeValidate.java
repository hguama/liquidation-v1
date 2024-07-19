package Service;

import Service.validations.EmployeeExceptions;
import Service.validations.ValidateInfoEmployee;
import domain.Contract;
import domain.Employee;
import domain.Position;
import domain.TypeContract;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeValidate implements IEmployeeValidate{
    @Override
    public Employee validate(Scanner scanner) throws Exception {
        Employee e = null;
        ValidateInfoEmployee validateInfoEmployee = new ValidateInfoEmployee();

        try {

            scanner.nextLine();
            System.out.println("Enter document:");
            String document = scanner.nextLine();
            validateInfoEmployee.validateDocument(document);

            System.out.println("Enter name:");
            String name = scanner.nextLine();
            validateInfoEmployee.validateName(name);


            System.out.println("Enter position:");
            System.out.println("1)Learner 2)Aux 3)Development Backend  4)Development Frontend  5)Area Boss");
            int position = scanner.nextInt();

            System.out.println("Enter salary - number of SMLV: (from 1 to 5)");
            BigDecimal salary = scanner.nextBigDecimal();
            BigDecimal salary_total = Contract.BASIC_SALARY.multiply(salary);
            validateInfoEmployee.validateSalary(salary_total);


            System.out.println("Enter contract start date:");
            System.out.println("Enter Year:");
            int year = scanner.nextInt();
            System.out.println("Enter Month:");
            int month = scanner.nextInt();
            System.out.println("Enter day:");
            int day = scanner.nextInt();

            System.out.printf("datos entrados: [doc: %s, name: %s, position: %d, salary: %s date_contract (year, month, day) - (%d, %d, %d)", document, name, position, String.valueOf(salary), year, month, day);

            //builder contract
            Contract contract = Contract.builder()
                                        .setTypeContract(TypeContract.INI)
                                        .setPosition(Contract.getPositionByNumber(position))
                                        .setContractDate(LocalDate.of(year, month, day))
                                        .setSalary(salary_total)
                                        .build();

            //builder employee
            e = Employee.builder()
                        .setDocument(document)
                        .setName(name)
                        .setActive(true)
//                             .setContract(new LinkedList<>(List.of(Mock.CONTRACT_INI_JAN_LEARNER)))
                        .setContract(new LinkedList<>(List.of(contract)))
                        .build();

        } catch (InputMismatchException exception) {
            System.out.println("error en entrada de datos. Ingrese el tipo de dato correcto");
            scanner.nextLine();
//            throw exception;
        } catch (EmployeeExceptions ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println("error:" + ex.getMessage());
//           throw ex;
        }


        return e;
    }


}
