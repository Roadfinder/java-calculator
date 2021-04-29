import java.util.Scanner;

class Input {

    public String[] input(){
        Scanner scan = new Scanner(System.in);
        String value = scan.nextLine();
        String[] values = value.split(" ");
        return values;
    }

}
