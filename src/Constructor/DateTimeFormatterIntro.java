package Constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {

    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, MM/dd/y");
        LocalDate today = LocalDate.now();

        System.out.println(today);

        System.out.println(today.format(df));

        LocalDate date1 = LocalDate.of(2022,7,1);

        System.out.println(date1.format(df)); // July-01-22

        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm:a");

        LocalTime time = LocalTime.of(17,30);

        System.out.println(time.format(tf));

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("EEEE, MMM/dd/y hh:mm a");
        LocalDateTime starts=LocalDateTime.now();

        System.out.println(starts.format(dtf));
    }
}