package ua.mega.lecture4.container;

/**
 * Created by Yefremov Yuriy
 */
public class Person<T, S> {

    private String name;
    private T clothSize;
    private S sex;

    public Person(String name, T clothSize, S sex) {
        this.name = name;
        this.clothSize = clothSize;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getClothSize() {
        return clothSize;
    }

    public void setClothSize(T clothSize) {
        this.clothSize = clothSize;
    }

    public S getSex() {
        return sex;
    }

    public void setSex(S sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", clothSize=" + clothSize +
                ", sex=" + sex +
                '}';
    }
}
