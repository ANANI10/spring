package com.devops.API.controller;

import com.devops.API.models.Client;
import com.devops.API.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
public class ClientController {
    @Autowired
    public ClientService clientService;

    @PostMapping(path ="/addClient")
    Client addClient(@RequestBody Client client){
        return clientService.creerClient(client);
    }

    @GetMapping(path ="/listeClient")
    List<Client>afficher(){
        return clientService.listeClient();
    }

    @PutMapping(path ="/miseAjour/{id}")
    Client updateClient(@PathVariable Integer id , @RequestBody Client client){
        return clientService.updateClient(id , client);
    }

    @DeleteMapping(path ="/deleteClient/{id}")
    String supprimerClient(Integer id){
        return clientService.deleteClient(id);
    }
}
