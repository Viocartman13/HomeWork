package src.com.vio.exercise7;

import src.com.vio.utils.DaysOfWeek;
import src.com.vio.utils.Utils;

public class Main7 {

    public static void main(String[] args) {

        System.out.println("Check if Saturday is work or weekend day: " + Utils.checkDayOfTheWeek(DaysOfWeek.SATURDAY));
        System.out.println("Check if Monday is work or weekend day: " + Utils.checkDayOfTheWeek(DaysOfWeek.MONDAY));
        System.out.println("Check if Friday is work or weekend day: " + Utils.checkDayOfTheWeek(DaysOfWeek.FRIDAY));
        System.out.println("Check if Sunday is work or weekend day: " + Utils.checkDayOfTheWeek(DaysOfWeek.SUNDAY));
    }
}
