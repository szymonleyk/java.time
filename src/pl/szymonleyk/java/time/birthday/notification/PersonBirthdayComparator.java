package pl.szymonleyk.java.time.birthday.notification;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;

public class PersonBirthdayComparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        LocalDate now = LocalDate.now();
        Period periodFirstPerson = Period.between(p1.getBirthday(), now);
        Period periodSecondPerson = Period.between(p2.getBirthday(), now);

        if(periodFirstPerson.getMonths() < periodSecondPerson.getMonths()){
            return 1;
        } else if(periodFirstPerson.getMonths() == periodSecondPerson.getMonths()) {
            if(periodFirstPerson.getDays() < periodSecondPerson.getDays()){
                return 1;
            } else if (periodFirstPerson.getDays() == periodSecondPerson.getDays()){
                return 0;
            }
        }
        return -1;
    }
}
