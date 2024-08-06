package com.sarayuth.how_to_consume_external_rest_api.service;

import com.sarayuth.how_to_consume_external_rest_api.model.Device;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/* Create a service class that will handle the logic for calling the external API */

@Service
public class DeviceService {

    // Injecting RestTemplate to make HTTP calls
    private final RestTemplate restTemplate;

    // constructor parameter
    public DeviceService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // Method to call the external API and get the list of devices
    public List<Device> getDevices() {
        String url = "https://api.restful-api.dev/objects";

        // Making a GET request to the external API and mapping the response to an array of Device object
        Device[] devices = restTemplate.getForObject(url, Device[].class);

        // Converting the array to a list and returning it
        return Arrays.asList(devices);
    }
}
