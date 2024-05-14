package org.example.Lab8.Task10_13_14.Task10.Data.JsonMapers;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonObjectMapper<T> {
    private final Class<T> clazz;
    private final ObjectMapper objectMapper;

    public JsonObjectMapper(Class<T> clazz) {
        this.clazz = clazz;
        this.objectMapper = new ObjectMapper();
    }

    public T map(String jsonString) {
        try {
            return objectMapper.readValue(jsonString, clazz);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
