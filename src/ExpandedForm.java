//You will be given a number and you will need to return it as a string in Expanded Form. For example:

public class ExpandedForm {
    public static String expandedForm(int num) {
        String result = "";
        char[] array = Integer.toString(num).toCharArray();
        int[] digits = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            digits[i] = Character.getNumericValue(array[i]);
        }
        for (int j = 0; j < digits.length; j++) {
            if (digits[j] == 0) {
                continue;
            }
            result += digits[j];
            for (int k = 0; k < digits.length - 1 - j; k++) {
                result += "0";
            }
            result += " + ";
        }
        result = result.substring(0, result.length() - 3);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(expandedForm(12));
        System.out.println(expandedForm(70304));
    }
}