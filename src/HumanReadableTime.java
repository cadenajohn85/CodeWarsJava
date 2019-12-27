public class HumanReadableTime {
    public static String makeReadable(int intervalInSeconds) {
        int hours = intervalInSeconds / 3600;
        int minutes = (intervalInSeconds / 60) % 60;
        int seconds = intervalInSeconds % 60;
        return String.format("%s:%s:%s", pad(hours), pad(minutes), pad(seconds));
    }

    public static String pad(int value) {
        return value < 10 ? "0" + value : Integer.toString(value);
    }

    public static void main(String[] args) {
        System.out.println(makeReadable(1938));
    }
}