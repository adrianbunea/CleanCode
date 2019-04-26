package Functions;

public class SwitchStatements {
    Money calculatePay(Employee e) throws InvalidEmployeeType {
        switch (e.type) {
            case COMMISSIONED:
                return calculateCommissionedPay(e);
            case HOURLY:
                return calculateHourlyPay(e);
            case SALARIED:
                return calculateSalariedPay(e);
            default:
                throw new InvalidEmployeeType(e.type);
        }
    }

    static final int COMMISSIONED = 0;
    static final int HOURLY = 1;
    static final int SALARIED = 2;

    class Money {}
    class Employee {
        int type;
    }

    class InvalidEmployeeType extends Exception {
        public InvalidEmployeeType(int type) {
            System.out.println(type);
        }
    }

    Money calculateCommissionedPay (Employee e) {
        Money m = new Money();
        return m;
    }

    Money calculateHourlyPay (Employee e) {
        Money m = new Money();
        return m;
    }

    Money calculateSalariedPay (Employee e) {
        Money m = new Money();
        return m;
    }
}
