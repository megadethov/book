package se.lecture_07_IO.item_7;

public class User extends Parent { //RE exception "No valid parent's constructor, потому как родитель не имплементирует Serializable"
    private int age;
    private String name;
//    private String field = "NEW"; // поле добавленное после сериализации
    private Test test; // NotSerializableException
    private transient String password; // не сериализуется (получает дефолтное значение - null)
    private static String example = "example"; // всегда будет значение которое определеное в классе

    private static final long serialVersionUID = 100L; // версия сериализации для защиты от изменений внесенных после сериализации

    public User(long id, int age, String name, Test test, String password) {
        super(id);
        this.age = age;
        this.name = name;
        this.test = test;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", test=" + test +
                ", password='" + password + '\'' +
                '}';
    }
}
