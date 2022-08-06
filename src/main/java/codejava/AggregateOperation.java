package codejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AggregateOperation {
    public static void main(String[] args) {

        List<Person> personList = CreatePerson.getPersonList();

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

        System.out.println("--------------------------");
        List<String> collectSurnameSort = personList.stream().map(p -> p.getLastName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        collectSurnameSort.stream().forEach(System.out::println);
        System.out.println("--------------------------");
        //LIMIT 5 youngest person
        personList.stream().sorted().limit(5).forEach(System.out::println);
        //SKIP find oldest age person
        System.out.println("--------------------------");
        personList.stream().sorted().skip(personList.size()-1).forEach(p-> System.out.println("Oldest age : " + p.getAge()));





    }
}
