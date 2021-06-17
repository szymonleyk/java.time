package pl.szymonleyk.java.time.birthday.notification;

public class GUI {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();

        for (int i = 0; i < 10000; i++) {
            personRepository.add(DataGenerator.newPerson());
        }

        personRepository.displayAll();
    }
}
