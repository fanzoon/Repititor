package task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson1 {

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();

        Person alex = new Person("Alex", 22);
        Person petr = new Person(new String("Petr"), 25);
        Person sasha = new Person("Sasha", 33);
        Person nikita = new Person("Nikita", 21);
        Person bob = new Person("Bob", 29);

        list.add(alex);
        list.add(petr);
        list.add(sasha);
        list.add(nikita);

        int maxAge = 0;

        for (Person person: list) {
            if (maxAge < person.getAge()) {
                maxAge = person.getAge();
            }
        }

        System.out.println(list);

        for (Person person: list) {
            if (person.getAge() == maxAge) {
                System.out.println("Человек с именем " + person.getName() + " - самый взрослый");
            }
        }


        System.out.println("Максимальный возраст составляет:" + maxAge);

        Iterator<Person> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!iterator.equals("Bob")) {
                list.add(bob);
            }
            iterator.next();
        }


        System.out.println(list);
    }
}
