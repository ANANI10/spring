package com.devops.API.service;

import com.devops.API.models.Produit;
import com.devops.API.repositorie.ProduitRepsository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor

public class ProduitServiceImpl implements ProduitService{
    public final ProduitRepsository produitRepsository;

    @Override
    public Produit creer(Produit produit) {
        return produitRepsository.save(produit);
    }

    @Override
    public List<Produit> lire() {
        return produitRepsository.findAll();
    }

    @Override
    public Produit modifier(Integer id, Produit produit) {
        return produitRepsository.findById(id).
                map(p->{
                    p.setName(produit.getName());
                    p.setDescription(produit.getDescription());
                    p.setPrix(produit.getPrix());
                    return produitRepsository.save(p);
                }).orElseThrow(()->new RuntimeException("Mise à jours de la table produit") );
    }

    @Override
    public String supprimer(Integer id) {
         produitRepsository.deleteById(id);
         return "Produit supprime avec succes";
    }
}
