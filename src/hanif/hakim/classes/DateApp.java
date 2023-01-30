package hanif.hakim.classes;

import java.util.Calendar;
import java.util.Date;

public class DateApp {
    public static void main(String[] args) {
        /**
         * Date and Calendar are used for Date, and Clock operation
         * It's recommended for using Calendar because some of Date Method are deprecated
         * also Calendar Class usage is a more way easier.
         */
        Date myDate = new Date();

        System.out.println(myDate);

        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.YEAR, 2025);
        calendar.set(Calendar.MONTH,Calendar.JANUARY);
        calendar.set(Calendar.HOUR_OF_DAY,10);

        Date result = calendar.getTime();
        System.out.println(result);
    }
}
