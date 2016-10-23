package full_guide.part_01.chapter_18_Collections._11_UsingExample;

/**
 * Created by mega on 08.09.2016.
 */
// Простой пример обработки списка почтовых адресов
public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return name + "\n" +
                street + "\n" +
                city + " " + state + " " + code;
    }
}
