package rogger.guia.app.oauth2.service;

import java.util.List;

import rogger.guia.app.oauth2.model.Alumno;

public interface AlumnoService {
	List<Alumno> listar();
	Alumno porId(Integer id);
	void guardar(Alumno alumno);
	void actualizar(Integer id, Alumno alumno);
	void eliminar(Integer id);
}
