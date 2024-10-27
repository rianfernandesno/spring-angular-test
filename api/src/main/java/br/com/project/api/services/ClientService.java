package br.com.project.api.services;

import br.com.project.api.model.Client;
import br.com.project.api.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client save(Client c){
        return clientRepository.save(c);
    }

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public void remove(Long id){
        clientRepository.deleteById(id);
    }
}
