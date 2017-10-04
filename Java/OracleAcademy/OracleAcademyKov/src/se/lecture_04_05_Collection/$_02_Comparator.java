package se.lecture_04_05_Collection;

import java.util.Comparator;
import java.util.List;

public class $_02_Comparator {
    public static void main(String[] args) {

        Customer customer1 = new Customer(20);
        Customer customer2 = new Customer(40);

/*        Comparator<Customer> comparator = new Comparator<Customer>() {
            @Override
            public int compare(Customer obj1, Customer obj2) {
                return obj1.age.compareTo(obj2.age);
            }
        };*/

        Comparator<Customer> comparator = (obj1, obj2) -> obj1.age.compareTo(obj2.age);

        System.out.println(comparator.compare(customer1, customer2));
    }
}

class Customer {
    public Integer age;

    public Customer(Integer age) {
        this.age = age;
    }
}

/*class MyComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.age.compareTo(o2.age);
    }*/
