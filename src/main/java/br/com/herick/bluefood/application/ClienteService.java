package br.com.herick.bluefood.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.herick.bluefood.domain.cliente.Cliente;
import br.com.herick.bluefood.domain.cliente.ClienteRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class ClienteService {

	@Autowired
	private ClienteRepository clienteRepository;

	public void saveCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}
}
