package MeaningfulNames;

import java.util.List;

public class DontPun {
    List<String> names;
    String firstName, lastName;

    void addName(String name) {
        names.add(name);
    }

    String concatenateNames() {
        return firstName + ' ' + lastName;
    }
}
