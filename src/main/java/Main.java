public class Main {
    public static void main(String[] args){
        calculate();
    }
    public static void calculate(){
        StringCalculator stringCalculator = new StringCalculator();
        Output.printOutput(stringCalculator.calculateStr(Input.splitInput()));
    }
}
