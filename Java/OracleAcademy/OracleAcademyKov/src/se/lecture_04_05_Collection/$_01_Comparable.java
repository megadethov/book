package se.lecture_04_05_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class $_01_Comparable {
    public static void main(String[] args) {
/*
        Integer i = 100;
        String s = "B";
        System.out.println(i.compareTo(50));
        System.out.println(s.compareTo("a"));*/

        User user1 = new User(20);
        User user2 = new User(30);

        System.out.println(user1.compareTo(user2));

    }
}

class User implements Comparable<User> {
    public Integer age;

    public User(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User that) {
        return this.age.compareTo(that.age);
    }
}
