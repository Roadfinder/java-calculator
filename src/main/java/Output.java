public class Output {
    public static void printOutput(int result) {
        System.out.println(result);
    }
    public static void printOutputError(Exception e) {
        System.out.println("출력 에러");
        e.printStackTrace();
    }

}
