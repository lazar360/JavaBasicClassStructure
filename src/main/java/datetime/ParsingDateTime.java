package datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("02 15 2010", formatter);
        LocalTime time = LocalTime.parse("11:33");
        System.out.println(date);
        System.out.println(time);

        String text =
                date.format(formatter);
        LocalDate parsedDate =
                LocalDate.parse(text, formatter);
        System.out.println(text);
        System.out.println(parsedDate);

        LocalDate myDate = LocalDate.of(2010, Month.MAY, 5);
        String dateString = formatter.format(myDate);
        System.out.println(myDate);

        LocalDate anotherDate = LocalDate.parse(dateString, formatter);
        anotherDate.plusMonths(5).plusDays(10);
        System.out.println(anotherDate); // anotherDate is not reassigned
    }
}
