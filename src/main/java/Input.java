import java.util.Scanner;

public class Input {

    public static String[] input(){
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        String[] values = value.split(" ");
        return values;
    }

}
