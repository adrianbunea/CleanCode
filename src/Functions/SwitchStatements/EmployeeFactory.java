package Functions.SwitchStatements;

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

class InvalidEmployeeType extends Exception {
    public InvalidEmployeeType(Type type) {
        System.out.println(type);
    }
}
