package domain;

public interface IEmployee {

    Employee updateContract(Employee employee, Contract contract);

    Employee endContract(Employee employee, Contract contract);
}
