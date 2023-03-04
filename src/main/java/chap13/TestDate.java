package chap13;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public interface TestDate {

    public static void main(String[] args) {
        Period period = Period.ofMonths(13);
        System.out.println(period);
        //Duration duration = Duration.of(1, ChronoUnit.DAYS);
        Duration duration = Duration.ofMinutes(90);
        System.out.println(duration);

        LocalDate date = LocalDate.parse("2020-04-30", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date.getYear() + " "
                + date.getMonth() + " "+ date.getDayOfMonth());

        var f = DateTimeFormatter.ofPattern("hh 'o''clock'");
        System.out.println(f.format(LocalTime.now()));

    }
}
