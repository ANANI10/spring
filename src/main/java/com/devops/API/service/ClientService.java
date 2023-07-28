package com.devops.API.service;

import com.devops.API.models.Client;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ClientService {

    Client  creerClient(Client client);

    List<Client> listeClient();

    Client updateClient(Integer id , Client client);

    String deleteClient(Integer id);
}
