package task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample {

    List<Person> list = new ArrayList<>();

    Person alex = new Person("Alex", 22);
    Person petr = new Person(new String("Petr"), 25);
    Person sasha = new Person("Sasha", 33);
    Person nikita = new Person("Nikita", 21);
    Person bob = new Person("Bob", 29);

    public void example() {

        list.add(alex);
        list.add(petr);
        list.add(sasha);
        list.add(nikita);
        list.add(bob);

        Map<String, Person> collect = list.stream()
                .collect(Collectors.toMap(Person::getName, p -> p));
        for (Map.Entry<String, Person> entry : collect.entrySet()) {
            System.out.println("name =  " + entry.getKey() + " Person = " + entry.getValue());
        }

//        list
//                .stream()
//                .filter(person -> person.getAge() > 20)
//                .filter(person -> !person.getName().equals("Alex"))
//                .forEach(System.out::println);
    }

    public void exampleMap() {
        Map<String, Person> name = new HashMap<>();

        name.put(alex.getName(), alex);
        name.put(petr.getName(), petr);
        name.put(sasha.getName(), sasha);
        name.put(nikita.getName(), nikita);
        name.put(bob.getName(), bob);

        for (Map.Entry<String, Person> entry : name.entrySet()) {
            System.out.println("name =  " + entry.getKey() + " Person = " + entry.getValue());
        }


    }
}
