package com.devops.API.service;

import com.devops.API.models.Produit;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProduitService {

    Produit creer(Produit produit);

    List<Produit>lire();

    Produit modifier(Integer id , Produit produit);

    String supprimer(Integer id);
}
