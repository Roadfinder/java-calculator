import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    private static int calculate(int num1, int num2, String op) {
        int result = 0;
        switch (op) {
            case "+" :
                result = num1 + num2;
                break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "/" :
                result = num1 / num2;
                break;
        }
        return result;
    }

    private static void calculator(String[] line) {
        List<String> numList = new ArrayList<>();
        List<String> opList = new ArrayList<>();

        for (int i=0; i<line.length; i+=2) {
            numList.add(line[i]);
        }
        for (int i=1; i<line.length; i+=2) {
            opList.add(line[i]);
        }
        int result = Integer.parseInt(numList.get(0));
        for (int i=0; i<opList.size(); i++) {
            result = calculate(result,Integer.parseInt(numList.get(i+1)),opList.get(i));
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] values = value.split(" ");
        calculator(values);
        scanner.close();
    }

}
