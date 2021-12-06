package guru.springfranework.sfgdi.controllers;

import guru.springfranework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

import java.sql.SQLOutput;

@Controller
public class MyController {

    private  final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }


}
