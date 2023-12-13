// package com.example.springbootmanagementexample;
 
// import java.util.Date;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RestController;
 
// @RestController
// public class SimpleRestController {
//     @GetMapping("/example")
//     public String example() {
//         return "Hello User !! " + new Date();
//     }
// }
package uk.co.danielbryant.djshopping.stockmanager;
 
import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class healthcheck {
    @GetMapping("/actuator/health")
    public String healthcheck() {
        return "Hello User !! " + new Date();
    }
}
