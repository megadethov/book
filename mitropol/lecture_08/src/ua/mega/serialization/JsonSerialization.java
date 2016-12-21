package ua.mega.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerialization {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(new Person("Вася", "Пупкин", 25));
        System.out.println(json);
    }
}
