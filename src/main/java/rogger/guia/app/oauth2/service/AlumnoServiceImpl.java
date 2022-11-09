package rogger.guia.app.oauth2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rogger.guia.app.oauth2.model.Alumno;
import rogger.guia.app.oauth2.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public List<Alumno> listar() {
		return (List<Alumno>) repository.findAll();
	}

	@Override
	public Alumno porId(Integer id) {
		return repository.findById(id).orElse(null);
	}
	
}
