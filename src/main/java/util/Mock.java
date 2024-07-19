package util;

import domain.Contract;
import domain.Employee;
import domain.Position;
import domain.TypeContract;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Mock {

    //dates
    public static final LocalDate JAN_INI = LocalDate.of(2024, Month.JANUARY, 1);
    public static final LocalDate MAR_INI = LocalDate.of(2024, Month.MARCH, 1);
    public static final LocalDate APR_INI = LocalDate.of(2024, Month.APRIL, 1);
    public static final LocalDate JUL_INI = LocalDate.of(2024, Month.JULY, 1);
    public static final LocalDate OCT_INI = LocalDate.of(2024, Month.OCTOBER, 1);

    public static final LocalDate MAR_END = LocalDate.of(2024, Month.MARCH, 30);
    public static final LocalDate JUN_END = LocalDate.of(2024, Month.JUNE, 30);
    public static final LocalDate SEP_END = LocalDate.of(2024, Month.SEPTEMBER, 30);
    public static final LocalDate DIC_END = LocalDate.of(2024, Month.DECEMBER, 30);

    public static final BigDecimal SALARY_BASIC = BigDecimal.valueOf(1300000.00);

    //contracts
  public final static  Contract CONTRACT_INI_JAN_LEARNER = new Contract(TypeContract.INI, JAN_INI, SALARY_BASIC, Position.LEARNER);
  public final static  Contract CONTRACT_INI_MAR_LEARNER = new Contract(TypeContract.INI, MAR_INI, SALARY_BASIC, Position.LEARNER);
  public final static  Contract CONTRACT_INI_APR_LEARNER = new Contract(TypeContract.INI, APR_INI, SALARY_BASIC, Position.LEARNER);

public final static  Contract CONTRACT_UPD_APR_DEV_BACK = new Contract(TypeContract.INI, APR_INI, SALARY_BASIC.add(SALARY_BASIC), Position.DEV_BACKEND);
public final static  Contract CONTRACT_END_JUN_DEV_BACK = new Contract(TypeContract.INI, JUN_END, SALARY_BASIC.add(SALARY_BASIC), Position.DEV_BACKEND);


    public static HashSet<Employee> getListEmployee(){
        return fullEmployee();
    }

    private static HashSet<Employee> fullEmployee() {

        //employee
          Employee e1 = new Employee("10", "Diego", true, new LinkedList<> (List.of(CONTRACT_INI_JAN_LEARNER)));
          Employee e2 = new Employee("11", "Bairon", true, new LinkedList<>(List.of(CONTRACT_INI_MAR_LEARNER)));
          Employee e3 = new Employee("12", "Edison", true, new LinkedList<>(List.of(CONTRACT_INI_APR_LEARNER)));


        return new HashSet<>(List.of(e1,e2,e3));
    }

    public static Employee getEmployee() {
        return new Employee("15", "James", true, new LinkedList<>(List.of(CONTRACT_INI_JAN_LEARNER)));
    }





}
