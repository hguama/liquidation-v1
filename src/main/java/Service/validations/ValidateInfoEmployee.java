package Service.validations;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ValidateInfoEmployee implements IValidateInfoEmployee {
    private final int NAME_MAX_LENGTH = 5;
    private final int DOCUMENT_MIN_LENGHT = 1;
    private final int DOCUMENT_MAX_LENGTH = 5;
    private final int POSITION_MIN_LENGHT = 5;
    private final int POSITION_MAX_LENGTH = 10;
    private final BigDecimal SALARY_MAX = BigDecimal.valueOf(7000000.00);
    private final BigDecimal SALARY_MIN = BigDecimal.valueOf(1300000.00);


    @Override
    public boolean validateName(String name) throws EmployeeExceptions {
        ValidateInfo validateInfo = new ValidateInfo();
        return validateInfo.validateNullorEmpty(name, "Nombre") &&
                validateInfo.validateLengthMax(name, NAME_MAX_LENGTH, "Nombre");
    }

    @Override
    public boolean validateDocument(String document) throws EmployeeExceptions {
        ValidateInfo validateInfo = new ValidateInfo();
        return validateInfo.validateNullorEmpty(document, "Nombre") &&
                validateInfo.validateLengthMinMax(document, DOCUMENT_MIN_LENGHT, DOCUMENT_MAX_LENGTH, "Documento");
    }

    @Override
    public boolean validateSalary(BigDecimal salary) throws EmployeeExceptions {
        ValidateInfo validateInfo = new ValidateInfo();
        return validateInfo.validateNullorEmpty(salary, "Salario") &&
                validateInfo.validateNumberMinMax(salary, SALARY_MIN, SALARY_MAX,  "Salario");
    }

    @Override
    public boolean validatePosition(String position) throws EmployeeExceptions {
        ValidateInfo validateInfo = new ValidateInfo();
        return validateInfo.validateLengthMinMax(position, POSITION_MAX_LENGTH, POSITION_MAX_LENGTH, "Cargo");
    }

    @Override
    public boolean validateContractStartDate(LocalDate date) {
        return false;
    }
}
