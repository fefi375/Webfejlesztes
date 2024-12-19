package inf.unideb.beadando.controller;


import inf.unideb.beadando.service.dto.TermekDto;
import inf.unideb.beadando.service.impl.TermekManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ProductController {

    @Autowired
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

    @DeleteMapping("/termek")
    public void delete(Long id){
        service.delete(id);
    }

    @GetMapping("/etel")
    public List<TermekDto> findAll(){
        return service.findAll();
    }

    @GetMapping("/termek/{nev}")
    public List<TermekDto> findAllByNev (@PathVariable String nev){
       return service.findByNev(nev);
    }


}
