package calculator;

import camp.nextstep.edu.missionutils.Console;
import java.util.NoSuchElementException;

public class InputHandler {
    public String getInput(){
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        try {
            return Console.readLine();
        } catch (NoSuchElementException e) {
            System.out.println("결과 : 0");
            return null;
        }
    }
}
