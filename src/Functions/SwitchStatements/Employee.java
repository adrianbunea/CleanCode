package Functions.SwitchStatements;

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
