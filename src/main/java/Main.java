public class Main {
    public static void main(String[] args) {

        Input i1 = new Input();
        String[] values = i1.input();

        Preprocessing pre = new Preprocessing();
        int result = pre.classify(values);
        //결과값 출력
        System.out.println(result);
    }

}