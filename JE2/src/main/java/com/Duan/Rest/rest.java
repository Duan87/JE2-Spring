package com.Duan.Rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Duan.cliente.cliente;
import com.Duan.dao.clienteDao;

@RestController
@RequestMapping("NutriNet/Cliente")
public class rest {
	@Autowired
	private clienteDao ClienteDao;
	@GetMapping
	public ResponseEntity<List <cliente>> getCliente(){
		List<cliente> clientes=ClienteDao.findAll();
		return ResponseEntity.ok(clientes);
	}
	@RequestMapping(value="{cliente_id}")
	public ResponseEntity<cliente> getClienteid(@PathVariable("cliente_id")  Integer cliente_id){
		Optional<cliente> clientes=ClienteDao.findById(cliente_id);
		if(clientes.isPresent()) {
			return ResponseEntity.ok(clientes.get());
			
		}else {
			return ResponseEntity.noContent().build();
			
		}
		
	}
	@PostMapping
	public ResponseEntity<cliente> crearCliente(@RequestBody cliente client){
		 cliente nuevoCliente = ClienteDao.save(client);
		 return ResponseEntity.ok(nuevoCliente);
	}
	@PutMapping
	public ResponseEntity<cliente> actualizarCli(@RequestBody cliente client){
		Optional <cliente> cliente= ClienteDao.findById(client.getCliente_id());
		if(cliente.isPresent()) {
			cliente clit = cliente.get();
			clit.setNombre(client.getNombre());
			ClienteDao.save(clit);
			return ResponseEntity.ok(clit);
			
		}else {
			return ResponseEntity.noContent().build();
			
		}
	}
}
