package MeaningfulNames;

import java.util.List;

public class DontPun {
    List<String> names;
    String firstName, lastName;

    void addName(String name) {
        names.add(name);
    }

    String addNames() {
        return firstName + ' ' + lastName;
    }
}
