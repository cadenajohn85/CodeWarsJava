public class ConsecutiveStrings {

    public static String longestConsec(String[] strarr, int k) {
        String current = "", output = "";
        int maxLength = 0;
        for (int i = 0; i < strarr.length - k + 1; i++) {
            for (int j = 0; j < k; j ++) {
                current += strarr[i + j];
            }
            if (current.length() > maxLength) {
                maxLength = current.length();
                output = current;
            }
            current = "";
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
    }

}
