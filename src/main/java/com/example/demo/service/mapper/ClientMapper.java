package com.example.demo.service.mapper;

import com.example.demo.dto.ClientDto;
import com.example.demo.entity.Client;
import org.springframework.stereotype.Component;

@Component
public class ClientMapper {

    public ClientDto clientDto(Client _client) {
        return new ClientDto(
                _client.getId(),
                _client.getNom(),
                _client.getPrenom());
    }

}
