package pl.szymonleyk.java.time.birthday.notification;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class DataGenerator {

    public static Person newPerson(){
        String name = randomName();
        String surname = randomSurname();
        LocalDate date = randomDate();

        return new Person(name, surname, date);
    }

    private static int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max - min) + min;
    }

    private static String randomName(){
        List<String> names = List.of("Marek", "Czarek", "Kasia", "Stasia");
        int index = getRandomInt(0, names.size()-1);

        return names.get(index);
    }

    private static String randomSurname(){
        List<String> surnames = List.of("Kowal", "Mak", "Nowak");
        int index = getRandomInt(0, surnames.size()-1);

        return surnames.get(index);
    }

    private static LocalDate randomDate(){
        int year = getRandomInt(1920, 2020);
        int month = getRandomInt(1, 12);
        int day = getRandomInt(1, 28);

        return LocalDate.of(year, month, day);
    }
}
