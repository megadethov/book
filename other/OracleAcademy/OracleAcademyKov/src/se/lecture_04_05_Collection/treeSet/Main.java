package se.lecture_04_05_Collection.treeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("DDD");
        set.add("AAA");
        set.add("B");
        set.add("ccccc");

        for (String s : set) {
            System.out.println(s); // String Comparable и реализует compareTo() - лексикографический порядок ABCDcd
        }

        Set<Test> st = new TreeSet<>(new Comparator<Test>() { // Компаратор можно вынести в отдельный класс, их может быть много
            @Override
            public int compare(Test o1, Test o2) {
                return o1.field - o2.field;
            }
        });
        st.add(new Test(50));
        st.add(new Test(20));
        st.add(new Test(100));
        st.add(new Test(10));

        // TreeSet не знает как сортировать, тк Test not Comparable, нужно заимплементить и реализовать compareTo()
        // или дать TreeSet в конструкторе отдельно класс - Comparator
        for (Test t : st) {
            System.out.println(t); // java.lang.ClassCastException. Test cannot be cast to java.lang.Comparable
        }
    }
}

class Test {
    public int field;

    public Test(int field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return "Test{" +
                "field=" + field +
                '}';
    }
}


