package hu.unideb.inf.webshop.controller;

import hu.unideb.inf.webshop.data.entity.Felhasznalo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebshopController {

    @GetMapping(path = "/api")
    public String hello(){
       return "Hello World";
    }

    @GetMapping("/person")
    public Felhasznalo szemely(){
        return new Felhasznalo();
    }
}
