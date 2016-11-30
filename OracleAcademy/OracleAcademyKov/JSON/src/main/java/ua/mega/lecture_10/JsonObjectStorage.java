package ua.mega.lecture_10;

import com.google.gson.Gson;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonObjectStorage {

    static String filePath = "JSON\\src\\main\\java\\ua\\mega\\lecture_10\\jsonObj.json";

    public static void main(String[] args) {
        List<Child> list = new ArrayList<Child>();
        list.add(new Child(100, "testInheritance", null));

        Child child = new Child(10, "Child", list);

        Gson gson = new Gson();

        // convert java object to JSON format,
        // and returned as JSON formatted string
        String json = gson.toJson(child);
//        System.out.println(json);

        //write converted json data to a file named "jsonObj.json"
        try (FileWriter writer = new FileWriter(new File(filePath))) {
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Parent {
    public String parentName = "parent";
}

class Child extends Parent {
    int age;
    String name;
    List<Child> stringList;

    public Child(int age, String name, List<Child> stringList) {
        this.age = age;
        this.name = name;
        this.stringList = stringList;
    }

    @Override
    public String toString() {
        return "Child{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", stringList=" + stringList +
                '}';
    }
}
