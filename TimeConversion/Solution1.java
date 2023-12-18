package TimeConversion;

public class Solution1 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        int hours = Integer.parseInt(s.substring(0, 2));
        int minutes = Integer.parseInt(s.substring(3, 5));
        int seconds = Integer.parseInt(s.substring(6, 8));
        String amPm = s.substring(8, 10);

        if (amPm.equals("PM") && hours != 12) {
            hours += 12;
        } else if (amPm.equals("AM") && hours == 12) {
            hours = 0;
        }

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);

    }

}
