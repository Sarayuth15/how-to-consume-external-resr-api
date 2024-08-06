package com.sarayuth.how_to_consume_external_rest_api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/* Define a class to represent the JSON structure */

// This annotation is used to ignore any unknown properties in the JSON response
@JsonIgnoreProperties(ignoreUnknown = true)
public class Device {

    // Fields to map the JSON properties
    private String id;
    private String name;

    // Nested class to represent the 'data' field in the JSON
    private Data data;

    // getters and getters
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Data getData() {
        return data;
    }
    public void setData(Data data) {
        this.data = data;
    }

    // Inner class to represent the 'data' object in the JSON
    public static class Data {
        private String color;
        private String capacity;

        // getters and getters
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
        public String getCapacity() {
            return capacity;
        }
        public void setCapacity(String capacity) {
            this.capacity = capacity;
        }
    }
}
