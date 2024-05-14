package org.example.Lab8.Task10_13_14.Task10.Data.JsonMapers;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;


public class JsonArrayMapper<T> {
    private final Class<T[]> arrayClazz;
    private final Class<T> clazz;
    private final ObjectMapper objectMapper;

    public JsonArrayMapper(Class<T[]> arrayClazz, Class<T> clazz) {
        this.arrayClazz = arrayClazz;
        this.clazz = clazz;
        this.objectMapper = new ObjectMapper();
    }

    public T[] map(String jsonString) {
        try {
            return objectMapper.readValue(jsonString, arrayClazz);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}