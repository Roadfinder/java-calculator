public class Main {
    public static void main(String[] args) {

        String[] values = Input.input();
        int result = Preprocessing.classify(values);
        //결과값 출력
        System.out.println(result);
    }

}