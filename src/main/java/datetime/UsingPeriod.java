package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);

        // start.toEpochDay(); // number of days since January 1 1970
        // Period period = Period.ofWeeks(1);
        // Period period = Period.ofMonths(1);
        //Period period = Period.ofDays(2);
        // Period period = Period.ofYears(2);
        Period period = Period.ofWeeks(2);

        cleanAnimalCage(start, end, period);

        System.out.println(start.plus(period));
        System.out.println(LocalDateTime.now().minus(period));
        System.out.println();
        // System.out.println(LocalTime.now().plus(period)); // time has no day or month

    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period){
        while(start.isBefore(end)){
            System.out.println("Need to clean the cage on date= " + start);
            start = start.plus(period);
        }
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date= " + start);
            start = start.plusMonths(1); // adding 1 month
        }
    }
}
