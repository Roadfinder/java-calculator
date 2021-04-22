

public class Main {

    public static void main(String[] args) {
        runCalculate();
    }

    public static void runCalculate() {
        Calculator calculator = new Calculator();
        String[] lineForCalculate = getStream();
        try {
            Output.printOutput(calculator.execute(lineForCalculate));
        }
        catch (Exception e){
            Output.printError(e);
            runCalculate();
        }
    }

    public static String[] getStream() {
        String line = Input.getInput();
        String[] splittedLine = Input.split(line);
        return splittedLine;
    }

}

