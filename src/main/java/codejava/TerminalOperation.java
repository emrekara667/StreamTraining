package codejava;

import java.util.*;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {

        List<Person> personList = CreatePerson.getPersonList();

        //ALLMATCH
        boolean resulGender= personList.stream().allMatch(p -> p.getGender().equals(Gender.FEMALE));
        System.out.println(resulGender);
        System.out.println("--------------------------");
        boolean resultGmail = personList.stream().allMatch(p -> p.getEmail().endsWith("gmail.com"));
        System.out.println(resultGmail);
        //ANYMATCH
        boolean resultGender = personList.stream().anyMatch(p -> p.getGender().equals(Gender.FEMALE));
        System.out.println(resultGender);
        System.out.println("--------------------------");
        boolean resultAge = personList.stream().anyMatch(p -> p.getAge() < 18);
        System.out.println(resultAge);
        //NONEMATCH
        System.out.println("--------------------------");
        boolean resultMailYahoo = personList.stream().noneMatch(p -> p.getEmail().endsWith("yahoo.com"));
        System.out.println(resultMailYahoo);
        System.out.println("--------------------------");
        boolean resultSurnameNoneMatch
                = personList.stream().noneMatch(p -> p.getLastName().equalsIgnoreCase("hill"));
        System.out.println(resultSurnameNoneMatch);
        System.out.println("--------------------------");
        //COLLECT
        List<String> lastNameList = personList.stream().map(p -> p.getLastName()).collect(Collectors.toList());
        lastNameList.stream().forEach(System.out::println);
        System.out.println("--------------------------");
        LinkedHashSet<String> stringLinkedHashSet = personList.stream().map(p -> p.getFirstName()).collect(Collectors.toCollection(LinkedHashSet::new));
        stringLinkedHashSet.stream().forEach(System.out::println);
        System.out.println("--------------------------");
        TreeSet<String> collectEmailTreeSet = personList.stream().map(p -> p.getEmail()).collect(Collectors.toCollection(TreeSet::new));
        collectEmailTreeSet.stream().forEach(System.out::println);
        System.out.println("--------------------------");
        Map<Gender, List<Person>> collectGroupGender = personList.stream().collect(Collectors.groupingBy(p -> p.getGender()));
        System.out.println(collectGroupGender);
        System.out.println("--------------------------");
        Map<String, List<Person>> collectFirstnameGroup
                = personList.stream().collect(Collectors.groupingBy(p -> p.getFirstName()));
        System.out.println(collectFirstnameGroup);
        System.out.println("--------------------------");
        String collectJoin = personList.stream().map(p -> p.getFirstName()).collect(Collectors.joining(", "));
        System.out.println(collectJoin);
        //COUNT
        long countFEMALE = personList.stream().filter(p -> p.getGender().equals(Gender.FEMALE)).count();
        System.out.println(countFEMALE);
        //MIN : min(comparator)
        System.out.println("--------------------------");
        Optional<Person> minFemaleYoungPerson = personList.stream().filter(p -> p.getGender().equals(Gender.FEMALE))
                .min((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println(minFemaleYoungPerson);
        System.out.println("--------------------------");
        Optional<Person> maxMaleOldestPerson = personList.stream().filter(p -> p.getGender().equals(Gender.MALE))
                .max((p1, p2) -> p1.getAge() - p2.getAge());
        System.out.println(maxMaleOldestPerson);
        //REDUCE Version #1: Optional<T> reduce(BinaryOperator<T> accumulator)





    }
}
