package guru.springfranework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

import java.sql.SQLOutput;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello world");

        return "Hi batho";
    }


}
