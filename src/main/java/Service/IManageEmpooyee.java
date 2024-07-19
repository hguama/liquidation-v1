package Service;

import domain.Employee;

import java.math.BigDecimal;

public interface IManageEmpooyee {

    Employee addEmployee(Employee employee);
    Employee updateSalary(BigDecimal newsalary);

}
