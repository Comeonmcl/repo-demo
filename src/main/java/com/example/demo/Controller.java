package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/depts")
   public  String  demo(){
        System.out.println("成功运行");
        return  "hahahahahahha";
   }
}
