import java.util.Scanner;

public class Input {
    public static final String BLANK = " ";

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public static String[] split(String line) {
        return line.split(BLANK);
    }
}
