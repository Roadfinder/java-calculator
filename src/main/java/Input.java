import java.util.Scanner;

public class Input {

    public static String[] splitInput(){
        System.out.println("계산식 입력 : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] splitString = input.split(" ");

        checkInput(splitString);

        return splitString;
    }

    public static void checkInput(String[] splitInput){
        if(splitInput.length % 2 == 0) throw new IllegalArgumentException("잘못된 연산입력입니다.");
    }
}
