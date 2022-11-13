package rogger.guia.app.oauth2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rogger.guia.app.oauth2.model.Colegio;
import rogger.guia.app.oauth2.repository.ColegioRepository;

@Service
public class ColegioServiceImpl implements ColegioService {
	@Autowired
	private ColegioRepository repository;

	@Override
	public List<Colegio> listar() {
		return repository.findAll();
	}

	@Override
	public Colegio porId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Colegio colegio) {
		colegio.setIdColegio(0);
		repository.save(colegio);
	}

	@Override
	public void actualizar(Integer id, Colegio colegio) {
		colegio.setIdColegio(id);
		repository.saveAndFlush(colegio);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}
}
