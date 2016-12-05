package ua.mega.module_02_Generics;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class GenericsExtendsSuper {

    @Test
    public void testPersonList() {
        List<Person> persons = Arrays.asList(new Person("Pasha", "Pavlov"), new Person("Lena", "Lenina"), new Person("Sasha", ""));
        System.out.println(isValidList(persons, new PersonValidator())); // false - Sasha не валидный

    }

    public boolean isValidList(List<Person> persons, Validator<Person> personValidator) {
        for (Person person : persons) {
            if (!personValidator.isValid(person)) {
                return false;
            }
        }
        return true;
    }

    public interface Validator<T> {
        boolean isValid(T value);
    }

    public static class PersonValidator implements Validator<Person> {

        public boolean isValid(Person value) {
            return isNotBlank(value.name) && isNotBlank(value.surname); // не null, не "", не состоит из одних пробелов
        }
    }

    public static class Person {
        public String name;
        public String surname;

        public Person(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
    }
}
