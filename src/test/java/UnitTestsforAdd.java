import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTestsforAdd {
    private final StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void addTestEmptyString() throws NegativeNumberException{
        String numbers = "";
        int result = stringCalculator.add(numbers);
        int expected = 0;
        assertEquals(result, expected);
    }

    @Test
    public void addTestOneInput() throws NegativeNumberException {
        String numbers = "1";
        int result = stringCalculator.add(numbers);
        int expected = 1;
        assertEquals(result, expected);
    }

    @Test
    public void addTestTwoInputsWithComma() throws NegativeNumberException{
        String numbers = "1,2";
        int result = stringCalculator.add(numbers);
        int expected = 3;
        assertEquals(result, expected);
    }

    @Test
    public void addTestHandleNewline() throws NegativeNumberException {
        String numbers = "1\n2,3";
        int result = stringCalculator.add(numbers);
        int expected = 6;
        assertEquals(result, expected);
    }

    @Test
    public void addTestCustomDelimiter() throws NegativeNumberException {
        String numbers = "//;\n1,2;3";
        int result = stringCalculator.add(numbers);
        int expected = 6;
        assertEquals(result, expected);
    }

    @Test
    public void addTestHandlingNegativeNumbers() {
        String numbers = "-1,2,-3";
        String expected = "Negatives not allowed.";
        NegativeNumberException exception = assertThrows(
                NegativeNumberException.class, () -> stringCalculator.add(numbers)
        );
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expected));
    }

    @Test
    public void addTestIgnoreAfterThousand() throws NegativeNumberException {
        String numbers = "1001,2,1003";
        int result = stringCalculator.add(numbers);
        int expected = 2;
        assertEquals(result, expected);
    }
}
