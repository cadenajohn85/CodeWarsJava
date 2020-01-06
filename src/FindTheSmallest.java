import java.util.Arrays;

public class FindTheSmallest {

    public static long[] smallest(long n) {
        long smallest = n;
        String number = Long.toString(n);
        long iIndex = 0, jIndex = 0;
        for (int i = 0; i < number.length(); i++) {
            for (int j = 0; j < number.length(); j++) {
                StringBuilder sb = new StringBuilder(number);
                char jValue = number.charAt(j);
                sb.deleteCharAt(j);
                sb.insert(i, jValue);
                String check = sb.toString();
                if (Long.parseLong(check) == smallest) {
                    if (j < jIndex) {
                        iIndex = i;
                        jIndex = j;
                    }
                }
                if (Long.parseLong(check) < smallest) {
                    smallest = Long.parseLong(check);
                    iIndex = i;
                    jIndex = j;
                }
            }
        }
        return new long[] {smallest, jIndex, iIndex};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallest(261235)));
        System.out.println(Arrays.toString(smallest(209917)));
        System.out.println(Arrays.toString(smallest(285365)));
        System.out.println(Arrays.toString(smallest(269045)));
        System.out.println(Arrays.toString(smallest(296837)));
    }

}
