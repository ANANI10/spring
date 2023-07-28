package com.devops.API.repositorie;

import com.devops.API.models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepsository extends JpaRepository<Produit , Integer> {

}
