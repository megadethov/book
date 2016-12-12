package ua.mega;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

public class GenericsExtendsSuper {

    @Test
    public void testPersonList() {
        List<Person> persons = Arrays.asList(new Person("Pasha", "Pavlov"), new Person("Lena", "Lenina"), new Person("Sasha", ""));
        List<Citizen> citizens = Arrays.asList(new Citizen("Pasha", "Pavlov", "Lviv"), new Citizen("Lena", "Lenina", ""), new Citizen("Sasha", "", ""));
        System.out.println(isValidList(persons, new PersonValidator())); // false - Sasha не валидный
//        System.out.println(isValidList(citizens, new PersonValidator())); // компилятор не запрещает - Citizen вместо Person
        System.out.println(isValidList(citizens, new PersonValidator())); // компилятор не запрещает - citizens

        // хотим получить уже отфильтрованный список Citizen
        List<Citizen> filteredCitizens = filteredInvalid(citizens, new PersonValidator()); // PECS (producer - extends, consumer - super)

    }

    // Метод - проверяет валидность List
//    public boolean isValidList(List<Person> persons, Validator<Person> personValidator) { // компилятор не запрещает - Citizen вместо Person
    public boolean isValidList(List<? extends Person> persons, Validator<Person> personValidator) { // так все ок
        for (Person person : persons) {
            if (!personValidator.isValid(person)) {
                return false;
            }
        }
        return true;
    }

    // Метод - принимает коллекцию, удаляет не валидные элементы, возвращает коллекцию с валидными
    public <T> List<T> filteredInvalid(List<T> values, Validator<? super T> validator) { // PECS
        List<T> result = new ArrayList<T>();
        for (T value : values) {
            if (validator.isValid(value)) result.add(value);
        }
        return result;
    }

    // Интерфейс Validator
    public interface Validator<T> {
        boolean isValid(T value);
    }

    // Класс реализующий валидацию
    public static class PersonValidator implements Validator<Person> {

        public boolean isValid(Person value) {
            return isNotBlank(value.name) && isNotBlank(value.surname); // не null, не "", не состоит из одних пробелов
        }
    }

    // класс Person
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

    // класс - наследник Person
    public static class Citizen extends Person {
        public String address;

        public Citizen(String name, String surname, String address) {
            super(name, surname);
            this.address = address;
        }

        @Override
        public String toString() {
            return "Citizen{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", address='" + address + '\'' +
                    '}';
        }
    }
}
