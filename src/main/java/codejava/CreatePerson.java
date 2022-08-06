package codejava;

import java.util.ArrayList;
import java.util.List;

public class CreatePerson {

    public static ArrayList<Person> personArrayList;

    public static List<Person> getPersonList() {
        personArrayList = new ArrayList<>();

        personArrayList.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26));
        personArrayList.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));
        personArrayList.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23));
        personArrayList.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, 39));
        personArrayList.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));
        personArrayList.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33));
        personArrayList.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));
        personArrayList.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30));
        personArrayList.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22));
        personArrayList.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));


        return personArrayList;
    }

}
