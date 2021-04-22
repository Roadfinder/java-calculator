import java.util.ArrayList;
import java.util.List;

public class Calculator {
    static private final String ADD_OPERATION = "+";
    static private final String SUBTRACT_OPERATION = "-";
    static private final String MULTIPLY_OPERATION = "*";
    static private final String DIVIDE_OPERATION = "/";
    static private final int NUMBER_INDEX = 0;
    static private final int OPERATION_INDEX = 1;

    List<String> numberList = new ArrayList<>();
    List<String> operationList = new ArrayList<>();
    int result = 0;

    public int operation(int firstNumber, int secondNumber, String operation) {
        switch (operation) {
            case ADD_OPERATION:
                result = firstNumber + secondNumber;
                break;
            case SUBTRACT_OPERATION:
                result = firstNumber - secondNumber;
                break;
            case MULTIPLY_OPERATION:
                result = firstNumber * secondNumber;
                break;
            case DIVIDE_OPERATION:
                result = firstNumber / secondNumber;
                break;
            default:
                throw new RuntimeException("부적합한 연산자가 입력되었습니다.");
        }
        return result;
    }

    public int execute(String[] line) {
        validation(line);
        addNumberList(line);
        addOperationList(line);
        result = Integer.parseInt(numberList.get(0));
        for (int i = 0; i < operationList.size(); i++) {
            result = operation(result, Integer.parseInt(numberList.get(i + 1)), operationList.get(i));
        }
        return result;
    }

    public void validation(String line[]) {
        if (line.length%2 == 0) throw new RuntimeException("올바른 식을 완성해주세요.");
    }

    public void addNumberList(String line[]) {
        for (int i = NUMBER_INDEX; i < line.length; i += 2) {
            numberList.add(line[i]);
        }
    }

    public void addOperationList(String line[]) {
        for (int i = OPERATION_INDEX; i < line.length; i += 2) {
            operationList.add(line[i]);
        }
    }


}
