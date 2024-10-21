package calculator;

public class StringProcessor {

        public String changeDelimiter(String input) {
            String delimiter = input.substring(2, 3);
            input = input.substring(4);
            input = input.replace(delimiter, ",");
            return input;
        }

        public String[] splitString(String input) {
            return input.split(",|;");
        }

        public void validateNegativeNumbers(String[] numbers) {
            for (String number : numbers) {
                if (number.contains("-")) {
                    throw new IllegalArgumentException("음수가 포함되어 있습니다.");
                }
            }
        }

        public String[] chooseNumbers(String[] numbers) {
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = numbers[i].replaceAll("[^0-9]", "");
            }
            return numbers;
        }
}
