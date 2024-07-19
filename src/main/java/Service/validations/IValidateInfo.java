package Service.validations;

import java.math.BigDecimal;

public interface IValidateInfo {
    boolean validateLengthMax(String string, int length_max, String field) throws EmployeeExceptions;
    boolean validateLengthMinMax(String string, int length_min, int length_max, String field) throws EmployeeExceptions;
    boolean validateNullorEmpty(Object object, String field) throws EmployeeExceptions;
    boolean validateNumberMinMax(BigDecimal number,BigDecimal number_min, BigDecimal number_max, String field) throws EmployeeExceptions;


    boolean isString(Object object);
}
