import java.io.*;

public class Serializ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person p = new Person("Вася", "Иванов", 20);
        p.getTickets().add(new Ticket("12", "TitleOfTicket"));

        // сохраняет в файл поля объекта в бинарном виде
//        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.ser"));
//        dos.writeUTF(p.getName());
//        dos.writeUTF(p.getSurname());
//        dos.writeInt(p.getAge());
//        dos.close();
        // считываем из файла сохраненные поля (нужно знать порядок следования)
//        DataInputStream dis = new DataInputStream(new FileInputStream("data.ser"));
//        String name = dis.readUTF();
//        String surname = dis.readUTF();
//        int age = dis.readInt();
//        System.out.println(name + " " + surname + " " + age + " лет");
//        dis.close();

        // Сериализация делает это на уровнеи объекта, для этого объект должен имплементить маркер - Serializable
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.ser"));
        oos.writeObject(p);
        oos.close();
        // Десерилизация
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.ser"));
        Person person = (Person) ois.readObject();
        System.out.println(person);
        oos.close();
    }
}
