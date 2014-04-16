package jp.smilecode.java8trial;

import java.util.Arrays;
import java.util.List;

public class FilterSample {
    public static void main(String[] args) {
        Person[] values = {
            new Person("Takashi", 33),
            new Person("Masaru", 28),
            new Person("Hanako", 15),
            new Person("Takahiro", 30),
            new Person("Tadashi", 22)
        };
        List<Person> list = Arrays.asList(values);
//        Person[] overThirties = list.stream()
        list.stream()
//                .filter(person -> person.getName().startsWith("T"))
                .filter(person -> person.getAge() >= 30)
                .forEach(System.out::println);
//                .toArray(Person[]::new);
        
//        for (Person person: overThirties) {
//            System.out.println(person);
//        }
            
    }

    static class Person {
        private final String name;
        private final int age;
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        };
        
        String getName() {
            return this.name;
        }
        int getAge() {
            return this.age;
        }
        @Override
        public String toString() {
            return String.format("%s(%d)", this.name, this.age);
        }
    }
}

