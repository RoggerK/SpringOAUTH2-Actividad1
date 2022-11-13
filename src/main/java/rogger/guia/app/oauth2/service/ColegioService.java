package rogger.guia.app.oauth2.service;

import java.util.List;

import rogger.guia.app.oauth2.model.Colegio;

public interface ColegioService {
	List<Colegio> listar();
	Colegio porId(Integer id);
	void guardar(Colegio colegio);
	void actualizar(Integer id, Colegio colegio);
	void eliminar(Integer id);
}
