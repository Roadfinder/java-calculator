

public class Main {

    public static void main(String[] args) {
        runCalculate();
    }

    public static void runCalculate() {
        Calculator calculator = new Calculator();
        String[] lineForCalculate = getFormattedInput();
        try {
            Output.printOutput(calculator.execute(lineForCalculate));
        }
        catch (Exception e){
            Output.printOutputError(e);
            runCalculate();
        }
    }

    public static String[] getFormattedInput() {
        String line = Input.inputExpression();
        String[] splittedLine = Input.split(line);
        return splittedLine;
    }

}

