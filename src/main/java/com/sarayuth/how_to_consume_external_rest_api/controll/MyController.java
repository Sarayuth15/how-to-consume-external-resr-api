package com.sarayuth.how_to_consume_external_rest_api.controll;

import com.sarayuth.how_to_consume_external_rest_api.model.Device;
import com.sarayuth.how_to_consume_external_rest_api.service.DeviceService;
import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/devices") // Base URL for the endpoints in this controller
public class MyController {

    // Injecting the DeviceService
    @Autowired
    private DeviceService deviceService;

    @GetMapping("/")
    public int helloWorld() {
        int age = 22;
        return age;
    }

    @GetMapping("/message")
    public String printWelcomeMessage() {

        String message = "Welcome to our rest API";
        return message;
    }

    // Endpoint to get the list of devices
    // http://localhost:8081/api/devices
    @GetMapping
    public List<Device> getDevices() {
        // Calling the service method to get the list of devices and returning it
        return deviceService.getDevices();
    }
}
