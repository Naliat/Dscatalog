package com.labsoft.aula.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labsoft.aula.domain.Cliente;
import com.labsoft.aula.repositories.ClienteRepository;
import com.labsoft.aula.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado Id: "+ id + ", Tipo: " + Cliente.class.getName( )));

	}
}
