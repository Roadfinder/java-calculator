import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private static final String ADD_OPERATION = "+";
    private static final String SUBTRACT_OPERATION = "-";
    private static final String MULTIPLY_OPERATION = "*";
    private static final String DIVIDE_OPERATION = "/";
    private static final int NUMBER_INDEX = 0;
    private static final int OPERATION_INDEX = 1;

    private List<String> numberList = new ArrayList<>();
    private List<String> operationList = new ArrayList<>();
    private int result = 0;

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

    private void validation(String[] formattedInput) {
        if (formattedInput.length%2 == 0) throw new RuntimeException("올바른 식을 완성해주세요.");
    }

    private void addNumberList(String[] formattedInput) {
        for (int i = NUMBER_INDEX; i < formattedInput.length; i += 2) {
            numberList.add(formattedInput[i]);
        }
    }

    private void addOperationList(String[] formattedInput) {
        for (int i = OPERATION_INDEX; i < formattedInput.length; i += 2) {
            operationList.add(formattedInput[i]);
        }
    }
}
