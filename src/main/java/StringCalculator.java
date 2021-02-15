public class StringCalculator {
    public int add(String numbers) {
        if(numbers.equals("")) {
            return 0;
        }
        String delimiter = ",";
        String[] numbersSplit = numbers.split(delimiter);
        int result = 0;
        for(String number : numbersSplit) {
            result += Integer.parseInt(number);
        }
        return result;
    }
}