package domain;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Employee implements IEmployee{
    private String document;
    private String name;
    private Boolean active;
    private LinkedList<Contract> contracts;


    public Employee() {
    }

    public Employee(String document, String name, Boolean active, LinkedList<Contract> contracts) {
        this.document = document;
        this.name = name;
        this.active = active;
        this.contracts = contracts;
    }

    public String getDocument() {
        return document;
    }

    public String getName() {
        return name;
    }

    public Boolean getActive() {
        return active;
    }

    public List<Contract> getContracts() {
        return contracts;
    }


    @Override
    public Employee updateContract(Employee employee, Contract contract) {
        return null;
    }

    @Override
    public Employee endContract(Employee employee, Contract contract) {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(document, employee.document);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(document);
    }

    public static EmployeeBuilder builder(){
        return new EmployeeBuilder();
    }

   public static class EmployeeBuilder {

        private String document;
        private String name;
        private Boolean active;
        private LinkedList<Contract> contracts;

        public EmployeeBuilder setDocument(String document){
            this.document = document;
            return this;
        }

        public EmployeeBuilder setName(String name){
            this.name = name;
            return this ;
        }

        public EmployeeBuilder setActive(Boolean active){
            this.active = active;
            return this ;
        }

        public EmployeeBuilder setContract(LinkedList<Contract> contracts){
            this.contracts = contracts;
            return this ;
        }

        public Employee build() {
            return new Employee(this.document, this.name, this.active, this.contracts);
        }


    }
}
