package interview;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author Dhiraj
 * @date 23/02/19
 */
public class DataToLocaldate {
    public static void main(String[] args) {
        Date d1= new Date();
        LocalDateTime localDate= d1.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        System.out.println(d1);
        System.out.println(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));


    }
}
