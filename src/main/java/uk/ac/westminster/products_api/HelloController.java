package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Week 1 starter controller.
 * Already provided:
 *   GET /hello   -> a simple greeting
 *   GET /status  -> a simple status message
 * TODO (Lab Activity 3):
 *   Add a new endpoint GET /goodbye that returns the String
 *   "Goodbye from Spring Boot!"
 */

import java.time.LocalDate;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello from Spring Boots!";
    }

    /*paused for activity 5
    @GetMapping("/status")
    public String status(){
        return "API running -" + LocalDate.now().toString();
    }*/

    @GetMapping("/status")
    public String status() {
        return "Application is running. Today's date: " + LocalDate.now().toString();
    }

    // TODO (Activity 3): add your /goodbye endpoint here.
    @GetMapping("/goodbye")
    public String goodbye(){ return "Goodbye from Spring Boots!"; }

}
