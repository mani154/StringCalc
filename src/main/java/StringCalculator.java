public class StringCalculator {
    public int add(String numbers) throws NegativeNumberException {
        if(numbers.equals("")) {
            return 0;
        }
        String delimiter = "[,\n]";
        if(numbers.startsWith("//")) {
            String[] num2 = numbers.split("\n");
            num2[0] = num2[0].replace("//", "");
            delimiter = delimiter.concat("|"+ num2[0]);
            numbers = numbers.replace("//" + num2[0] + "\n","");
        }
        String[] numbersSplit = numbers.split(delimiter);
        int result = 0;
        for(String number : numbersSplit) {
            if(number.contains("-")) {
                throw new NegativeNumberException();
            }
            result += Integer.parseInt(number);
        }
        return result;
    }
}