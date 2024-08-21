package datetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FormattingDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate date2 = LocalDate.of(2024, 5, 22);
        LocalDate date3 = LocalDate.parse("2024-05-22", DateTimeFormatter.ISO_LOCAL_DATE);


        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));

        DateTimeFormatter shortFormatter =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormatter =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println("shortFormatter"+ shortFormatter.format(dateTime));
        System.out.println(mediumFormatter.format(dateTime));
        System.out.println(dateTime.format(mediumFormatter));
        // System.out.println(mediumFormatter.format(time)); // throws exception

        DateTimeFormatter dateTimeFormatter =
                DateTimeFormatter.ofPattern("d-MM-yyyy * hh:mm");
        System.out.println(dateTimeFormatter.format(dateTime));

        // Before Java 8
        SimpleDateFormat sf =
                new SimpleDateFormat("hh:mm");
        System.out.println(sf.format(new Date()));

    }
}
