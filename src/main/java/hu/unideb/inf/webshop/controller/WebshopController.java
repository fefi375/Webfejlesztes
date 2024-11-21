package hu.unideb.inf.webshop.controller;

import hu.unideb.inf.webshop.data.entity.FelhasznaloEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebshopController {

    @GetMapping(path = "/api")
    public String hello(){
       return "Hello World";
    }

    @GetMapping("/person")
    public FelhasznaloEntity szemely(){
        return new FelhasznaloEntity();
    }


}
