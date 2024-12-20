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

   /* @GetMapping("/hello") Helllo próba
    public String hello(){
        return "Hello, a webalkalmazas elindult.";
    }*/

    @PostMapping("/addtermek")
    public TermekDto save (@RequestBody TermekDto termek){
        return service.save(termek);
    }

    @PutMapping("/updatetermek")
    public TermekDto update(@RequestBody TermekDto termek){
        if(termek.getId() > 0L){
            return service.save(termek);
        }

        else return null;
    }

    @DeleteMapping("/termek/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/termekek")
    public List<TermekDto> findAll(){
        return service.findAll();
    }

    @GetMapping("/termek/{nev}")
    public List<TermekDto> findAllByNev (@PathVariable String nev){
       return service.findByNev(nev);
    }


}
