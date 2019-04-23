package MeaningfulNames;
import java.lang.*;

public class ClassAndMethodNames {
    class Employee {
        String name;

        public String getName() {
            return name;
        }
    }

    class Customer {
        String name;

        public void setName(String name) {
            this.name = name;
        }
    }

    class Paycheck {
        boolean posted;

        public boolean isPosted() {
            return this.posted;
        }
    }

    void exampleFunction() {
        Employee employee = new Employee();
        String name = employee.getName();

        Customer customer = new Customer();
        customer.setName("mike");

        Paycheck paycheck = new Paycheck();
        if (paycheck.isPosted()) {
            // do something
        }
    }
}
