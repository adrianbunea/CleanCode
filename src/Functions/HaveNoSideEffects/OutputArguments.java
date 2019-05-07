package Functions.HaveNoSideEffects;

public class OutputArguments {
    class Report {
        public void appendFooter() {
            // Do something to this object
        }
    }

    void testFunction() {
        Report report = new Report();
        report.appendFooter();
    }
}
