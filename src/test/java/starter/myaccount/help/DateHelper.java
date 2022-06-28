package starter.myaccount.help;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateHelper {
    public static String getDateToDay(String format) {
        try {
            SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(format);
            String newDate = DATE_FORMAT.format(new Date());
            return newDate;
        } catch (Exception e) {
            System.out.println("ERROR MESSAGE");
        }
        return format;
    }
}
