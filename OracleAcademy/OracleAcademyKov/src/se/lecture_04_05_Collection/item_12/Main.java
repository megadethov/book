package se.lecture_04_05_Collection.item_12;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<User> users = new HashSet<>(); // создаем HashSet
        // создаем два одинаковых юзера с разными детекторами
        User user1 = new User(40, "Petya", "user1");
        User user2 = new User(40, "Petya", "user2");
        User user3 = new User(40, "Petya", "user3");

        // добавление элементов в HashSet возвращает boolean
        boolean add1 = users.add(user1);
        boolean add2 = users.add(user2);
        for (User u : users) {
            System.out.println(u);
        }
        System.out.println(add1); // true
        System.out.println(add2); // true
// если не переопределить хеш-код для User, то используется нативный hashCode() Object
//        System.out.println(user1.hashCode()); // 685325104 (так как разный, оба юзера добавляются в HashSet)
//        System.out.println(user2.hashCode()); // 460141958

//        Переопределим методы equals(Object o) и hashCode()
//        учитываются только поля age и firstName класса User
//        поэтому user1 и user2 считаются одинаковыми и
//        user2 не добавляется в HashSet.

        System.out.println("================================================================");

        // для HashMap ключи совпадают и просто переписывается значение для того же ключа
        Map<User, String> hm = new HashMap<>();
        // сначала добавится юзер1, а затем по этому же ключу допишется новое значение String = Put user2
        // ключ user1 и user2 считаются одинаковыми, тк у них одинаковый хеш-код и они эквивалентны по equals
        hm.put(user1, "Put user1");
        hm.put(user2, "Put user2");
        for(Map.Entry<User, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue()); // User{age=40, name='Petya', detector='user1'} - Put user2
        }

        System.out.println("================================================================");

        // рассмотрим TreeMap Есть три разных юзера с одинаковым name
        user1 = new User(40, "Petya", "user1");
        user2 = new User(12, "Petya", "user2");
        user3 = new User(45, "Petya", "user3");

        Map<User, String> tm = new TreeMap<>(new MyUserDetectorComparator()); // Внешний Comparator перекрывает Comparable User
        tm.put(user1, "Put user1");
        tm.put(user2, "Put user2");
        tm.put(user3, "Put user3");
// TreeMap использует equals() и Comparator. Если не дать Map в конструкторе Comparator или не заимплементить User Comparable
// получим - java.lang.ClassCastException User cannot be cast to java.lang.Comparable
        for (Map.Entry entry : tm.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }





    }
}

class User implements Comparable<User> { // Comparable нужно указать для User иначе в override будет Object
    private Integer age;
    private String name;
    public String detector;

    public User(Integer age, String name, String detector) {
        this.age = age;
        this.name = name;
        this.detector = detector;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", detector='" + detector + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != null ? !age.equals(user.age) : user.age != null) return false;
        return name != null ? name.equals(user.name) : user.name == null;

    }

    @Override
    public int hashCode() {
        int result = age != null ? age.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }


    @Override
    public int compareTo(User o) {
        return this.age.compareTo(o.age); // сравниваем по возрасту
    }
}

// Можем создать отдельно Comparator для сравнения по полю - detector
class MyUserDetectorComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {
        return o1.detector.compareTo(o2.detector);
    }
}