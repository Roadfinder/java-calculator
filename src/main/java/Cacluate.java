public class Cacluate {

    private static int result;

    public static int calculate(int first_num, String operator, int second_num){
        //연산부
        if (operator == "+") {
            return add(first_num,second_num);
        }
        if (operator == "-") {
            return sub(first_num, second_num);
        }
        if (operator == "*") {
            return mul(first_num , second_num);
        }
        if (operator == "/") {
            return div( first_num ,second_num);
        }
        throw new RuntimeException("올바르지 않는 연산자입니다.");
    }

    private static int add(int a,int b){
        return a+b;
    }
    private static int sub(int a,int b){
        return a-b;
    }
    private static int mul(int a,int b){
        return a*b;
    }
    private static int div(int a,int b){
        return a/b;
    }


}
