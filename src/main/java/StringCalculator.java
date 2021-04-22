import java.util.*;

public class StringCalculator {

    public static void main(String[] args){
        StringCalculator stringCalculator = new StringCalculator();

        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("계산식 : ");
        String input = sc.next();s
        */
        String input = "12222 + 33315 / 15";

        int output = stringCalculator.calculateStr(input);
        System.out.println(output);
    }

    public int calculateStr(String input){
        String[] inputSplit = input.split(" ");
        //System.out.println(Arrays.toString(inputSplit));
        int number = Integer.parseInt(inputSplit[0]);
        for(int i = 0; i < inputSplit.length - 2; i += 2){
            //System.out.println("operator -> "+inputSplit[i+1].charAt(0));
            number = calculate(number, inputSplit[i+1].charAt(0), Integer.parseInt(inputSplit[i+2]));
        }
        return number;
    }

    public int calculate(int firstFactor, char operator, int secondFactor) {
        //System.out.println("calculating -> " + firstFactor + operator + secondFactor);
        if (operator == '+')
            return add(firstFactor,secondFactor);
        if (operator == '-')
            return subtract(firstFactor,secondFactor);
        if (operator == '*')
            return multiply(firstFactor,secondFactor);
        if (operator == '/')
            return divide(firstFactor,secondFactor);

        throw new RuntimeException("알 수 없는 연산자");
    }


    public int add(int num1, int num2){
        return num1 + num2;
    }
    public int subtract(int num1, int num2){
        return num1 - num2;
    }
    public int multiply(int num1, int num2){
        return num1 * num2;
    }
    public int divide(int num1, int num2){
        try {
            return num1 / num2;
        } catch(ArithmeticException e){
            System.out.println("0 으로 나눌수 없음 : " + num1 + "/" + num2);
        }
        throw new RuntimeException();
    }



}