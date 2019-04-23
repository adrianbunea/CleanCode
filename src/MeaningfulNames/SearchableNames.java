package MeaningfulNames;

public class SearchableNames {
    int sum = 0;
    int[] taskEstimate;
    int realDaysPerIdealDay = 4;
    final int WORK_DAYS_PER_WEEK = 5;
    final int NUMBER_OF_TASKS = 34;

    private void exampleFunction() {
        for (int j=0; j<NUMBER_OF_TASKS; j++) {
            int realTaskDays = taskEstimate[j] * realDaysPerIdealDay;
            int realTaskWeeks = (realTaskDays / WORK_DAYS_PER_WEEK);
            sum += realTaskWeeks;
        }
    }
}
