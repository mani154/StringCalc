import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTestsforAdd {
    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void addTestEmptyString() {
        String numbers = "";
        int result = stringCalculator.add(numbers);
        int expected = 0;
        assertEquals(result, expected);
    }

    @Test
    public void addTestOneInput() {
        String numbers = "1";
        int result = stringCalculator.add(numbers);
        int expected = 1;
        assertEquals(result, expected);
    }

    @Test
    public void addTestTwoInputsWithComma() {
        String numbers = "1,2";
        int result = stringCalculator.add(numbers);
        int expected = 3;
        assertEquals(result, expected);
    }

    @Test
    public void addTestHandleNewline() {
        String numbers = "1\n2,3";
        int result = stringCalculator.add(numbers);
        int expected = 6;
        assertEquals(result, expected);
    }
}
