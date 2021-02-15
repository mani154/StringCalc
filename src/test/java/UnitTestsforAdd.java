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
}
