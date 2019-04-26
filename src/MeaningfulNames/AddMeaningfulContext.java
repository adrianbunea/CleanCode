package MeaningfulNames;

public class AddMeaningfulContext {
    class GuessStatisticsMessage {
        String number;
        String verb;
        String pluralModifier;

        public String make(char candidate, int count) {
            createPluralDependentMessageParts(count);
            return String.format(
                    "There %s %s %s%s",
                    verb, number, candidate, pluralModifier);
        }

        private void createPluralDependentMessageParts(int count) {
            if (count == 0) {
                thereAreNoLetters();
            }
            else if (count == 1) {
                thereIsOneLetter();
            }
            else {
                thereAreMultipleLetters(count);
            }
        }

        private void thereAreNoLetters() {
            number = "no";
            verb = "are";
            pluralModifier = "s";
        }

        private void thereIsOneLetter() {
            number = "1";
            verb = "is";
            pluralModifier = "";
        }

        private void thereAreMultipleLetters(int count) {
            number = Integer.toString(count);
            verb = "are";
            pluralModifier = "s";
        }
    }

    void printGuessStatistics(char candidate, int count) {
        GuessStatisticsMessage guessMessage = new GuessStatisticsMessage();
        System.out.println(guessMessage.make(candidate, count));
    }
}
