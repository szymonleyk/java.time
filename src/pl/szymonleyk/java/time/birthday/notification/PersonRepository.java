package pl.szymonleyk.java.time.birthday.notification;

import java.util.*;

public class PersonRepository {
    private List<Person> people = new ArrayList<>();

    public void add(Person person){
        people.add(person);
    }

    public List<Person> getAll(){
        people.sort(new PersonBirthdayComparator());
        return people;
    }

    public void displayAll(){
        for (Person person : getAll()) {
            System.out.println(person);
        }
    }
}
