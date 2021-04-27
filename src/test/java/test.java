
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;


//import static org.hamcrest.MatcherAssert.assertThatThrownBy;
//import static org.hamcrest.CoreMatchers.isqualsTo;
@DisplayName("javaCalculator테스트")
public class test {
    @Test
    @DisplayName("올바른_연산식_계산")
    public void successTest() throws Exception {
        String value = "5 + 3 * 4 / 2";
        String[] values = value.split(" ");

        assertThat(Preprocessing.classify(values)).isEqualTo(16);
    }


    @Test
    @DisplayName("에러_연산value_validation")
    public void validationTest() {
        String errorValue = "2 + 3 * 4 / ";

        String[] errorValues = errorValue.split(" ");

        assertThatThrownBy(() -> {
            Preprocessing.classify(errorValues);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("잘못된 연산입니다. 다시 입력하세요.");

    }


    @Test
    @DisplayName("에러_잘못된_연산자")
    public void wrong_input_value() {

        String errorValue = "2 + 3 _ 4";
        String[] errorValues = errorValue.split(" ");
        assertThatThrownBy(() -> {
            Preprocessing.classify(errorValues);
        }).isInstanceOf(RuntimeException.class)
                .hasMessageContaining("올바르지 않는 연산자입니다.");
    }




}
