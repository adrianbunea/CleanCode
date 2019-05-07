package Functions;

public class CommandQuerySeparation {
    public boolean attributeExists(String attribute) {
        // checks if the attribute exists
        return true;
    }

    public void setAttribute(String attribute, String value) {
        // sets the value of the named attribute
    }

    public void testFunction() {
        if (attributeExists("name")) {
            setAttribute("name", "Adrian");
        }
    }
}
