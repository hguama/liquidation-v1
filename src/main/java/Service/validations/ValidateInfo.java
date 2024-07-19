package Service.validations;

import java.math.BigDecimal;

public class ValidateInfo implements IValidateInfo {

    @Override
    public boolean validateLengthMax(String string, int max_length, String field) throws EmployeeExceptions {
        if (string.length() <= max_length) {
            return true;
        } else {
            throw new EmployeeExceptions(createMsgEx("400", field, "longitud maxima debe ser: "+max_length));
        }
    }

    @Override
    public boolean validateLengthMinMax(String string, int length_min, int length_max, String field) throws EmployeeExceptions {
        if (string.length() <= length_max && string.length() >= length_min) {
            return true;
        } else {
            throw new EmployeeExceptions(createMsgEx("400", field, "longitud debe estar entre: "+length_min + " y "+length_max));
        }
    }

    @Override
    public boolean validateNullorEmpty(Object object, String field) throws EmployeeExceptions {
        if (object != null && !object.equals("")) {
            return true;
        } else {
            throw new EmployeeExceptions(createMsgEx("400", field, "campo no debe ser vacio ni null: "));
        }
    }

    @Override
    public boolean validateNumberMinMax(BigDecimal number, BigDecimal number_min, BigDecimal number_max, String field) throws EmployeeExceptions {
        if (number.compareTo(number_max.add(BigDecimal.valueOf(1))) == -1 &&
                number.compareTo(number_min.subtract(BigDecimal.valueOf(1))) == 1  ) {
            return true;
        } else {
            throw new EmployeeExceptions(createMsgEx("400", field, "valor maximo debe ser <= a: "+number_max + "valor minimo debe ser >= a: "+number_min));
        }

    }


    @Override
    public boolean isString(Object object) {
        return false;
    }

    private String createMsgEx(String code, String field, String detail) {
        return String.format("%nERROR%n[ code: %s%n " +
//                "description: %s%n" +
                "field: %s%n" +
                "detail: %s%n ]", code, field, detail
        );
    }
}
