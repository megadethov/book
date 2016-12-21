package ua.mega.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

public class JsonSerialization {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT); // красивый вывод

        Person person = new Person("Вася", "Пупкин", 25);

//        String json = objectMapper.writeValueAsString(person);
//        System.out.println(json);

        // запись в файл
//        FileOutputStream fos = new FileOutputStream("person.json");
//        objectMapper.writeValue(fos, person);

        // считать из файла
//        Person p = objectMapper.readValue(new File("person.json"), Person.class); // можно указать любой класс !!!
//        System.out.println(p);

        // можно указать любой класс !!! Выдрать из json прямо в мапу, например.
        Map<String, Object> map = objectMapper.readValue(new File("person.json"), Map.class);
        System.out.println(map.get("name"));
    }
}
