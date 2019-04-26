package MeaningfulNames;

public class PickOneWordPerConcept {
    class Person {
        String name;

        String fetchName() {
            return name;
        }
    }

    class Book {
        String text;

        String retrieveText() {
            return text;
        }
    }

    class BankAccount {
        double balance;

        double getBalance() {
            return balance;
        }
    }
}
