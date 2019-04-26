package Functions;

public class SwitchStatements {
    Money calculatePay(EmployeeRecord r) throws InvalidEmployeeType {
        EmployeeFactoryImpl employeeFactory = new EmployeeFactoryImpl();
        Employee e = employeeFactory.makeEmployee(r);
        return e.calculatePay();
    }

    abstract class Employee {
        public abstract boolean isPayday();
        public abstract Money calculatePay();
        public abstract void  deliverPay(Money pay);
    }

    class CommissionedEmployee extends Employee {
        public boolean isPayday() {
            return true;
        }

        public Money calculatePay() {
            return new Money();
        }

        public void deliverPay(Money pay) {

        }

        public CommissionedEmployee(EmployeeRecord r) {

        }
    }

    class HourlyEmployee extends Employee {
        public boolean isPayday() {
            return true;
        }

        public Money calculatePay() {
            return new Money();
        }

        public void deliverPay(Money pay) {

        }

        public HourlyEmployee(EmployeeRecord r) {

        }
    }

    class SalariedEmployee extends Employee {
        public boolean isPayday() {
            return true;
        }

        public Money calculatePay() {
            return new Money();
        }

        public void deliverPay(Money pay) {

        }

        public SalariedEmployee(EmployeeRecord r) {

        }
    }

    interface EmployeeFactory {
        Employee makeEmployee (EmployeeRecord r) throws InvalidEmployeeType;
    }

    class EmployeeFactoryImpl implements EmployeeFactory {
        public Employee makeEmployee(EmployeeRecord r) throws  InvalidEmployeeType {
            switch (r.type) {
                case COMMISSIONED:
                    return new CommissionedEmployee(r);
                case HOURLY:
                    return new HourlyEmployee(r);
                case SALARIED:
                    return new SalariedEmployee(r);
                default:
                    throw new InvalidEmployeeType(r.type);
            }
        }
    }

    class EmployeeRecord {
        int type;
    }

    class InvalidEmployeeType extends Exception {
        public InvalidEmployeeType(int type) {
            System.out.println(type);
        }
    }

    class Money {}

    static final int COMMISSIONED = 0;
    static final int HOURLY = 1;
    static final int SALARIED = 2;
}
