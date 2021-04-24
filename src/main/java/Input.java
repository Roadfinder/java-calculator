import java.util.Scanner;

public class Input {
    private static final String BLANK = " ";

    public static String inputExpression() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String[] split(String line) {
        return line.split(BLANK);
    }
}
