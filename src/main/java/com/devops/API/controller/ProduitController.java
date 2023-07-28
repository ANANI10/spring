package com.devops.API.controller;

import com.devops.API.models.Produit;
import com.devops.API.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor

public class ProduitController {
    public ProduitService produitService;

    @PostMapping(path = "/create")
    Produit create(@RequestBody Produit produit){
        return produitService.creer(produit);
    }

    @GetMapping(path = "/list")
    List<Produit>liste(){
        return produitService.lire();
    }

    @PutMapping(path = "/update/{id}")
    Produit update(@PathVariable Integer id , @RequestBody Produit produit){
        return produitService.modifier(id , produit);
    }

    @DeleteMapping(path = "/suppresion/{id}")
    public String supprimer(@PathVariable Integer id){
        return produitService.supprimer(id);
    }
}
