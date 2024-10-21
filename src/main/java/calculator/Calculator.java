package calculator;

import java.util.Arrays;

public class Calculator {

    public int sum(String[] numbers) {
        try {
            return Arrays.stream(numbers)
                    .mapToInt(Integer::parseInt)
                    .sum();
        } catch (NumberFormatException e) {
            System.out.println("잘못된 숫자 형식이 포함되어 있습니다.");
            return 0;
        }
    }
}
