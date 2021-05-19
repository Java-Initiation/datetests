import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

    public static void main(String[] args) {

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat1.format(date1));

        Date date2 = new Date(2016 - 1900, Calendar.MAY, 19, 23, 59, 30);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(simpleDateFormat2.format(date2));
        System.out.println(simpleDateFormat2.format(date1));
    }

}
