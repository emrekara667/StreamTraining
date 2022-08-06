package codejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Operation {
    public static void main(String[] args) {

        List<Person> personList = getPersonList();

        //FILTER
        personList.stream().filter(p -> p.getGender().equals(Gender.MALE))
                .forEach(System.out::println); //Function reference
        System.out.println("--------------------------");
        personList.stream().filter(p -> p.getGender().equals(Gender.FEMALE) && p.getAge() < 25)
                .forEach(System.out::println);
        //MAP -> map, maptoınt, maptolong, maptodouble
        List<String> collectEmailList = personList.stream().map(p -> p.getEmail() + ".com").collect(Collectors.toList());
        collectEmailList.stream().forEach(System.out::println);
        System.out.println("--------------------------");
        List<String> stringNameListUpperCase = personList.stream().filter(p -> p.getGender().equals(Gender.FEMALE))
                .map(p -> p.getFirstName().toUpperCase()).collect(Collectors.toList());
        stringNameListUpperCase.stream().forEach(System.out::println);
        System.out.println("--------------------------");
        //SORTED -> sorted() : sorted natural order
        //sorted(comparator) : sorted by a comparator
        System.out.println("--------------------------");
        personList.stream().sorted().forEach(System.out::println);
        System.out.println("--------------------------");
        personList.stream().sorted((p1, p2) -> -p1.getLastName().compareTo(p2.getLastName()))
                .forEach(System.out::println);

        //DISTINCT
        System.out.println("--------------------------");
        int[] numbers = {23, 58, 12, 23, 17, 29,99, 98, 29,12};
        List<Integer> collectDistinctIntNumber = Arrays
                .stream(numbers)   //Int stream
                .distinct()
                .boxed()           //Stream<Integer>
                .collect(Collectors.toList());

        collectDistinctIntNumber.stream().forEach(System.out::println);


    }

    private static List<Person> getPersonList() {
        List<Person> listPersons = new ArrayList<>();

        listPersons.add(new Person("Alice", "Brown", "alice@gmail.com", Gender.FEMALE, 26));
        listPersons.add(new Person("Bob", "Young", "bob@gmail.com", Gender.MALE, 32));
        listPersons.add(new Person("Carol", "Hill", "carol@gmail.com", Gender.FEMALE, 23));
        listPersons.add(new Person("David", "Green", "david@gmail.com", Gender.MALE, 39));
        listPersons.add(new Person("Eric", "Young", "eric@gmail.com", Gender.MALE, 26));
        listPersons.add(new Person("Frank", "Thompson", "frank@gmail.com", Gender.MALE, 33));
        listPersons.add(new Person("Gibb", "Brown", "gibb@gmail.com", Gender.MALE, 27));
        listPersons.add(new Person("Henry", "Baker", "henry@gmail.com", Gender.MALE, 30));
        listPersons.add(new Person("Isabell", "Hill", "isabell@gmail.com", Gender.FEMALE, 22));
        listPersons.add(new Person("Jane", "Smith", "jane@gmail.com", Gender.FEMALE, 24));


        return listPersons;
    }
}
