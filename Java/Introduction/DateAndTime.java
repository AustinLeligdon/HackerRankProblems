import java.util.*;
import java.text.*;
import java.math.*;

//Given a day, month, and year, print out what day of the week that is

public class DateAndTime {
    public static String getDay(String day, String month, String year) {
        int intYear = Integer.parseInt(year);
        int intMonth = Integer.parseInt(month);
        int intDay = Integer.parseInt(day);
        
        Calendar calendar = new GregorianCalendar(intYear, intMonth-1, intDay-1);
        int dayofweek = calendar.get(Calendar.DAY_OF_WEEK);
        
        String[] days = {"", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};
        
        return days[dayofweek];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
    }
}