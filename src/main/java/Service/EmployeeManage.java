package Service;

import domain.Employee;
import util.Mock;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EmployeeManage implements IManageEmpooyee {
    private HashSet<Employee> employeeList;

    public EmployeeManage() {
//        employeeList = new ArrayList<>();
        employeeList = Mock.getListEmployee();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employeeList.add(employee);

        return employee;
    }

    @Override
    public Employee updateSalary(BigDecimal newsalary) {
        return null;
    }

    public void viewEmployee() {
        System.out.println("-------List of  Employeee----------");

        employeeList.stream()
                    .forEach(e -> {
                     String view =  String.format("Employee [doc: %s - name: %s - active: %s - contracts:{ %s]",
                                e.getDocument(), e.getName(), e.getActive(), e.getContracts()
                        );
                        System.out.println(view);

                    });

    }


}
