package ua.mega.domain;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="PERSON_TYPE")
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    protected int getId() {
        return id;
    }

    protected String getName() {
        return name;
    }

    public abstract void calculateReport();
}
