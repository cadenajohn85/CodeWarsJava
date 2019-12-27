//More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and a lead g (integer > 0)
//how long will it take B to catch A?
//
//The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds
//(round down to the nearest second) or a string in some languages.

import java.util.Arrays;

public class TortoiseRacing {
    public static int[] race(int slowerFeetPerHour, int fasterFeetPerHour, int leadInFeet) {
        int secondsNeeded = leadInFeet * 3600 / (fasterFeetPerHour - slowerFeetPerHour);
        return slowerFeetPerHour >= fasterFeetPerHour ?
                null : new int[] {secondsNeeded / 3600, (secondsNeeded / 60) % 60, secondsNeeded % 60};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(race(720, 850, 70)));
    }
}
