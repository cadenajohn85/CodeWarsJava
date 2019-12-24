public class HighAndLow {

    public static String highAndLow(String numbers) {

        String []noSpaces = numbers.split(" ");
        int min = Integer.parseInt(noSpaces[0]), max = Integer.parseInt(noSpaces[0]);
        for (String stringNum : noSpaces) {
            if (Integer.parseInt(stringNum) < min) { min = Integer.parseInt(stringNum); }
            if (Integer.parseInt(stringNum) > max) { max = Integer.parseInt(stringNum); }
        }
        return max + " " + min;

    }

    public static void main(String[] args) {
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
