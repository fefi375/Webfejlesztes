package inf.unideb.beadando.controller;


import inf.unideb.beadando.service.dto.TermekDto;
import inf.unideb.beadando.service.impl.TermekManagementServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ProductController {

    private TermekManagementServiceImpl service;

    @GetMapping("/hello")
    public String hello(){
        return "Hello, a webalkalmazas elindult.";
    }

    @PostMapping("/savetermek")
    public TermekDto save (@RequestBody TermekDto termek){
        return service.save(termek);
    }

    @PutMapping("/updatetermek")
    public TermekDto update(TermekDto termek){
        if(termek.getId() >0L){
            return service.save(termek);
        }

        else return null;
    }


}
