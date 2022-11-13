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

import rogger.guia.app.oauth2.model.Alumno;
import rogger.guia.app.oauth2.service.AlumnoService;

@RestController
@RequestMapping("alumno/v1")
public class AlumnoRestController {
	@Autowired
	private AlumnoService service;

	@GetMapping("/listar")
	public ResponseEntity<List<Alumno>> listar() {
		return new ResponseEntity<List<Alumno>>(service.listar(), HttpStatus.OK);
	}

	@GetMapping("/listar/{id}")
	public ResponseEntity<Alumno> listar(@PathVariable Integer id) {
		Alumno alumno = service.porId(id);
		if (alumno == null) {
			return new ResponseEntity<Alumno>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Alumno>(alumno, HttpStatus.OK);
		}
	}

	@PostMapping("/guardar")
	public ResponseEntity<Void> guardar(@RequestBody Alumno alumno) {
		service.guardar(alumno);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

	@PutMapping("/actualizar/{id}")
	public ResponseEntity<Void> actualizar(@PathVariable Integer id, @RequestBody Alumno alumno) {
		service.actualizar(id, alumno);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@DeleteMapping("/eliminar/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
