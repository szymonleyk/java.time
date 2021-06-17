package pl.szymonleyk.java.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        date = LocalDate.of(1990, 12, 12);
        System.out.println(date);

        date = LocalDate.parse("2020-01-01");
        System.out.println(date);

        Locale locale = new Locale("es", "ES");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", locale);
        System.out.println(date.format(formatter));


        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh mm ss", locale);
        LocalTime localTime = LocalTime.of(12,13,14);
        System.out.println(localTime.format(timeFormatter));

        date = date.plusDays(5);
        System.out.println(date);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }
}
