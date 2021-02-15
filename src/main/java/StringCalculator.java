public class StringCalculator {
    public int add(String numbers) throws NegativeNumberException {
        if(numbers.equals("")) {
            return 0;
        }
        String delimiter = "[,\n]";
        if(numbers.startsWith("//")) {
            String[] num2 = numbers.split("\n");
            num2[0] = num2[0].replace("//", "");
          //  delimiter = delimiter.concat("|"+ num2[0]);
            for(int i=0; i<num2[0].length(); i++) {
                if(num2[0].startsWith("[") && num2[0].endsWith("]")) {
                    num2[0] = num2[0].replace("[", "");
                    num2[0] = num2[0].replace("]", "");
                    delimiter = delimiter.concat("|" + num2[0].charAt(i));
                }
            }
            numbers = numbers.replace("//" + num2[0] + "\n","");
        }
        String[] numbersSplit = numbers.split(delimiter);
        int result = 0;
        for(String number : numbersSplit) {
            if(number.contains("-")) {
                throw new NegativeNumberException();
            }
            int getNumber = Integer.parseInt(number);
            if(getNumber >= 1000) {
                getNumber = 0;
            }
            result += getNumber;
        }
        return result;
    }
}