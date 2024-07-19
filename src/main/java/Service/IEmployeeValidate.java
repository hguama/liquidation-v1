package Service;

import domain.Employee;

import java.util.Scanner;

public interface IEmployeeValidate {
    Employee validate(Scanner scanner) throws Exception;
}
