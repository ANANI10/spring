package com.devops.API.service;

import com.devops.API.models.Client;
import com.devops.API.repositorie.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService{
    @Autowired
    public ClientRepository clientRepository;
    @Override
    public Client creerClient(Client client) {
        return clientRepository.save(client) ;
    }

    @Override
    public List<Client> listeClient() {
        return clientRepository.findAll();
    }

    @Override
    public Client updateClient(Integer id, Client client) {
        return clientRepository.findById(id).
                map(p->{
                    p.setName(client.getName());
                    p.setPrenom(client.getPrenom());
                    p.setAge(client.getAge());
                    p.setSexe(client.getSexe());
                    p.setNationalite(client.getNationalite());
                    p.setPays(client.getPays());
                    p.setProfession(client.getProfession());
                    return clientRepository.save(p);
                }).orElseThrow(()->new RuntimeException("Mise à jours de la table Client") );
    }

    @Override
    public String deleteClient(Integer id) {
        return null;
    }
}
