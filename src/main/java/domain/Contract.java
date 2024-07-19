package domain;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Contract {
    public static final BigDecimal BASIC_SALARY = BigDecimal.valueOf(1300000.00);
    private TypeContract typeContract;
    private LocalDate contract_date;
    private BigDecimal salary;
    private Position position;

    public Contract() {
    }

    public Contract(TypeContract typeContract, LocalDate date, BigDecimal salary, Position position) {
        this.typeContract = typeContract;
        this.contract_date = date;
        this.salary = salary;
        this.position = position;
    }

    public static ContractBuilder builder() {
        return new ContractBuilder();
    }

    public static Position getPositionByNumber(int option) {
        Position position1 = null;

        switch (option) {
            case 1:
                position1 = Position.LEARNER;
                break;

            case 2:
                position1 = Position.AUX;
                break;

            case 3:
                position1 = Position.DEV_BACKEND;
                break;
            case 4:
                position1 = Position.DEV_FRONTEND;
                break;

            case 5:
                position1 = Position.AREA_BOSS;
                break;

            default:
                break;

        }

        return position1;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "typeContract=" + typeContract +
                ", contract_date=" + contract_date +
                ", salary=" + salary +
                ", position=" + position +
                '}';
    }

    public static class ContractBuilder {
        private TypeContract typeContract;
        private LocalDate contract_date;
        private BigDecimal salary;
        private Position position;

        public ContractBuilder setTypeContract(TypeContract typecontract) {
            this.typeContract = typecontract;
            return this;
        }

        public ContractBuilder setContractDate(LocalDate contract_date) {
            this.contract_date = contract_date;
            return this;
        }

        public ContractBuilder setSalary(BigDecimal salary) {
            this.salary = salary;
            return this;
        }

        public ContractBuilder setPosition(Position position) {
            this.position = position;
            return this;
        }

        public Contract build() {
            return new Contract(typeContract, contract_date, salary, position);
        }
    }
}
