package Service.validations;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface IValidateInfoEmployee {
    boolean validateName(String name) throws EmployeeExceptions;

    boolean validateDocument(String document) throws EmployeeExceptions;

    boolean validatePosition(String position) throws EmployeeExceptions;

    boolean validateContractStartDate(LocalDate date);

    boolean validateSalary(BigDecimal salary) throws EmployeeExceptions;
}
