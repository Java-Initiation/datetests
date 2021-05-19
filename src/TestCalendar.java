import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, Calendar.MAY);
        calendar.set(Calendar.DAY_OF_MONTH, 19);
        calendar.set(Calendar.HOUR_OF_DAY, 23);
        calendar.set(Calendar.MINUTE, 59);
        calendar.set(Calendar.SECOND, 30);
        Date date = calendar.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(simpleDateFormat.format(date));

        Calendar calendar2 = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(simpleDateFormat2.format(calendar2.getTime()));

        SimpleDateFormat simpleDateFormatFrench = new SimpleDateFormat("EEEEE MMMM yyyy HH:mm:ss", Locale.FRENCH);
        SimpleDateFormat simpleDateFormatRusse = new SimpleDateFormat("EEEEE MMMM yyyy HH:mm:ss", new Locale("ru"));
        SimpleDateFormat simpleDateFormatChinois = new SimpleDateFormat("EEEEE MMMM yyyy HH:mm:ss", Locale.CHINESE);
        SimpleDateFormat simpleDateFormatAllemand = new SimpleDateFormat("EEEEE MMMM yyyy HH:mm:ss", Locale.GERMAN);

        System.out.println(simpleDateFormatFrench.format(calendar2.getTime()));
        System.out.println(simpleDateFormatRusse.format(calendar2.getTime()));
        System.out.println(simpleDateFormatChinois.format(calendar2.getTime()));
        System.out.println(simpleDateFormatAllemand.format(calendar2.getTime()));

    }


}
