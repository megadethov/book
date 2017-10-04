package se.lecture_04_05_Collection.item_12;

import java.util.*;

public class $Main {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>(); // создаем HashSet
        // создаем два одинаковых юзера с разными детекторами
        Person person1 = new Person(40, "Petya", "user1");
        Person person2 = new Person(40, "Petya", "user2");
        Person person3 = new Person(40, "Petya", "user3");

        // добавление элементов в HashSet возвращает boolean
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        for (Person next : persons) {
            System.out.println(next);
        }

// если не переопределить хеш-код для User, то используется нативный hashCode() Object
//        System.out.println(user1.hashCode()); // 685325104 (так как разный, оба юзера добавляются в HashSet)
//        System.out.println(user2.hashCode()); // 460141958

//        Переопределим методы equals(Object o) и hashCode()
//        учитываются только поля age и firstName класса User
//        поэтому user1 и user2 считаются одинаковыми и
//        user2 не добавляется в HashSet.

        System.out.println("================================================================");

        // для HashMap ключи совпадают и просто переписывается значение для того же ключа
        Map<Person, Integer> people = new HashMap<>();
        people.put(person1, 1000);
        people.put(person2, 1000);
        people.put(person3, 2000);

        for (Person next: people.keySet()) {
            System.out.println(next);
        }


        // сначала добавится юзер1, а затем по этому же ключу допишется новое значение String = Put user2
        // ключ user1 и user2 считаются одинаковыми, тк у них одинаковый хеш-код и они эквивалентны по equals


        System.out.println("================================================================");

        // рассмотрим TreeMap Есть три разных юзера с одинаковым name
        Person p1 = new Person(40, "Petya", "user1");
        Person p2 = new Person(42, "Petya", "user2");
        Person p3 = new Person(43, "Petya", "user3");

        Map<Person, Integer> tm = new TreeMap<>((a, b) -> a.detector.compareTo(b.detector)); // Внешний Comparator перекрывает Comparable User

        tm.put(p1, 1000);
        tm.put(p2, 1000);
        tm.put(p3, 2000);

        for (Map.Entry next : tm.entrySet()) {
            System.out.println(next.getKey() + " - " + next.getValue());
        }

// TreeMap использует equals() и Comparator. Если не дать Map в конструкторе Comparator или не заимплементить User Comparable
// получим - java.lang.ClassCastException User cannot be cast to java.lang.Comparable

    }
}

class Person {
    public Integer age;
    public String name;
    public String detector;

    public Person(Integer age, String name, String detector) {
        this.age = age;
        this.name = name;
        this.detector = detector;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", detector='" + detector + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != null ? !age.equals(person.age) : person.age != null) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = age != null ? age.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}