package Functions.SwitchStatements;

public class Payroll {
    Money calculatePay(EmployeeRecord r) throws InvalidEmployeeType {
        EmployeeFactoryImpl employeeFactory = new EmployeeFactoryImpl();
        Employee e = employeeFactory.makeEmployee(r);
        return e.calculatePay();
    }
}
