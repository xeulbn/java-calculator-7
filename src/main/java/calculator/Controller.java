package calculator;

public class Controller {

    public void run(){
        InputHandler inputHandler = new InputHandler();
        StringProcessor stringProcessor = new StringProcessor();
        Calculator calculator = new Calculator();

        String inputStr = inputHandler.getInput();
        if (inputStr == null) {
            return;
        }
        if (inputStr.startsWith("//")) {
            inputStr = stringProcessor.changeDelimiter(inputStr);
        }

        String[] splitStr = stringProcessor.splitString(inputStr);
        stringProcessor.validateNegativeNumbers(splitStr);
        splitStr = stringProcessor.chooseNumbers(splitStr);

        int answer = calculator.sum(splitStr);
        System.out.println("결과 : " + answer);
    }
}
