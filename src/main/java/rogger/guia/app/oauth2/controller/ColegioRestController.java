package rogger.guia.app.oauth2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rogger.guia.app.oauth2.model.Colegio;
import rogger.guia.app.oauth2.service.ColegioService;

@RestController
@RequestMapping("colegio/v1")
public class ColegioRestController {
	@Autowired
	private ColegioService service;

	@GetMapping("/listar")
	public ResponseEntity<List<Colegio>> listar() {
		return new ResponseEntity<List<Colegio>>(service.listar(), HttpStatus.OK);
	}

	@GetMapping("/listar/{id}")
	public ResponseEntity<Colegio> listar(@PathVariable Integer id) {
		Colegio colegio = service.porId(id);
		if (colegio == null) {
			return new ResponseEntity<Colegio>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Colegio>(colegio, HttpStatus.OK);
		}
	}

	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Colegio colegio) {
		service.guardar(colegio);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Void> actualizar(@PathVariable Integer id, @RequestBody Colegio colegio) {
		service.actualizar(id, colegio);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
