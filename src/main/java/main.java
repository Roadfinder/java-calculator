import java.util.ArrayList;
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


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();
        String[] values = value.split(" ");
        int num1, num2;
        int result = 0;
        String op = "";
        for (int i = 2; i < values.length; i+=2) {
            if (i == 2) {
                num1 = Integer.parseInt(values[i-2]);
                num2 = Integer.parseInt(values[i]);
                op = values[i-1];
                result = calculate(num1, num2, op);
            }
            else {
                num1 = result;
                num2 = Integer.parseInt(values[i]);
                op = values[i-1];
                result = calculate(num1, num2, op);
            }
        }
        System.out.println(result);
        scanner.close();



    }

}
