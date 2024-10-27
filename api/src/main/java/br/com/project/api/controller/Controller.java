package br.com.project.api.controller;

import br.com.project.api.model.Client;
import br.com.project.api.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private ClientService clientService;


    @PostMapping("/")
    public Client register(@RequestBody Client c){
        return clientService.save(c);
    }

    @GetMapping("/")
    public List<Client> selectAll(){
        return clientService.findAll();
    }

    @PutMapping("/")
    public  Client edit(@RequestBody Client c){
        return clientService.save(c);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id){
        clientService.remove(id);
    }
}
