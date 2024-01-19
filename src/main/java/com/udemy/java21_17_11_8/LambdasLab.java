package com.udemy.java21_17_11_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface Printable<T> {
    void print(T t);
}

interface Retrievable<T> {
    T retrieve();
}

interface Evaluate<T> {
    Boolean isNegative(T t);
}

interface Functionable<T, R> {
    R applyThis(T t);// similar to Function
}

class Person {

    private Integer age;
    private String name;
    private Double height;

    Person(String name, Integer age, Double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name=" + name + ", height=" + height + '}';
    }

    public Double getHeight() {
        return height;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class LambdasLab {
    private static List<Person> getPeople() {
        List<Person> result = new ArrayList<>();
        result.add(new Person("Mike", 33, 1.8));
        result.add(new Person("Mary", 25, 1.4));
        result.add(new Person("Alan", 34, 1.7));
        result.add(new Person("Zoe", 30, 1.5));
        return result;
    }
    public static void main(String... args) {
//        LambdasLab lambdasLab = new LambdasLab();
//        lambdasLab.consumer();
//        lambdasLab.supplier();
//        lambdasLab.predicate();
//        lambdasLab.function();

        List<Person> people = getPeople();
        sortAge(people);
        sortName(people);
        sortHeight(people);
    }

    private static void sortName(List<Person> people) {
        people.sort(Comparator.comparing(Person::getName));
        System.out.println("Sorted by name:");
        people.forEach(System.out::println);
    }

    private static void sortAge(List<Person> people) {
        people.sort(Comparator.comparing(Person::getAge));
        System.out.println("Sorted by age:");
        people.forEach(System.out::println);
    }

    private static void sortHeight(List<Person> people) {
        people.sort(Comparator.comparing(Person::getHeight));
        System.out.println("Sorted by height:");
        people.forEach(System.out::println);
    }

    private void function() {
        Functionable<Integer, String> functionable = i -> "Number is: " + i;
        functionable.applyThis(25);

        Function<Integer, String> function = i -> "Number is: " + i;
        function.apply(25);
    }

    private void predicate() {
        Evaluate<Integer> evaluate = i -> i < 0;
        evaluate.isNegative(-1);
        evaluate.isNegative(1);

        Predicate<Integer> predicate = i -> i < 0;
        predicate.test(-1);

        check(4, i -> i % 2 == 0);
        check(7, i -> i % 2 == 0);

        check("Mr. Joe Bloggs", s -> s.startsWith("Mr."));
        check("Ms. Ann Bloggs", s -> s.startsWith("Mr."));

        Person person = new Person("Mike", 33, 1.8);
        check(person, p -> p.getAge() >= 18);
    }

    public static <T> boolean check(T t, Predicate<T> predicate) {
        return predicate.test(t);
    }

    private void supplier() {
        Retrievable<Integer> retrievable = () -> 77;
        retrievable.retrieve();

        Supplier<Integer> supplierL = () -> 77;
        supplierL.get();
    }

    public void consumer() {
        Printable<String> printableL = s -> System.out.println(s);
        printableL.print("Printable lambda");

        Consumer<String> consumerL = s -> System.out.println(s);
        consumerL.accept("Printable lambda");

        Consumer<String> consumerMR = System.out::println;
        consumerMR.accept("Printable lambda");
    }

}
