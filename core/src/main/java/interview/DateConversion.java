package interview;


import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * @author Dhiraj
 * @date 07/03/19
 */
public class DateConversion {
    public static void main(String[] args) {

        Date d=new Date(1552241626000l);
       // System.out.println(d);
        // 7-Mar-2019
        //7-Mar
        System.out.println(getDateWithoutTime(d));;





    }

    private static String getDateWithoutTime(Date d) {
        System.out.println(d);
        Calendar cal= Calendar.getInstance();
        cal.setTime(d);

        SimpleDateFormat format= new SimpleDateFormat("dd MMM");
        cal.setTime(d);
        return format.format(cal.getTime());
    }
}
