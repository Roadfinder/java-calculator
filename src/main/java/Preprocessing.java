class Preprocessing {

    private static int first_num = 0;
    private static int second_num = 0;
    private static int return_num = 0;
    public static String operator = "";

    //숫자 or 연산자 or 에러(숫자x, 연산자x)?
    private boolean isNumber(String a) {
        //잠결에 해서 어떻게 했는지 설명못하겠어 무의식속에서 코드가 완성됐어
        boolean isNum;
        isNum = true;
        try {
            Integer.parseInt(a);
        } catch (NumberFormatException e) {
            if (a.equals("+") || a.equals("-") || a.equals("*") || a.equals("/")) {
                isNum = false;
                return isNum;
            } else
                throw new RuntimeException("올바르지 않는 연산자입니다.");
        }
        return isNum;
    }

    //연산자 부여
    public void setOper(String oper) {
        if (oper.equals("+")) {
            operator = "+";
        }
        if (oper.equals("-")) {
            operator = "-";
        }
        if (oper.equals("*")) {
            operator = "*";
        }
        if (oper.equals("/")) {
            operator = "/";
        }

    }

    //숫자 부여
    public void setNumber(int idx, String num) {
        if (idx == 0) { //제일 처음일때만
            return_num = Integer.parseInt(num);
        } else { // 두번째 숫자 들어올때
            first_num = return_num;
            second_num = Integer.parseInt(num);
            Cacluate cal = new Cacluate();
            return_num = cal.calculate(first_num, operator, second_num);
        }
    }

    public int classify(String[] values) {
        //잘못된 연산식인지 먼저 확인.
        wrongMath(values);

        for (int i = 0; i < values.length; i++) {
            //연산자 부호
            boolean num = isNumber(values[i]);
            if (!num)   //연산자면
                setOper(values[i]);
            else // 숫자이면.
                setNumber(i, values[i]);
        }
        return return_num;
    }//end classify()

    private void wrongMath(String[] values) {
        if (values.length % 2 == 0)
            throw new IllegalArgumentException("잘못된 연산입니다. 다시 입력하세요.");
    }
}