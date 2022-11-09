package rogger.guia.app.oauth2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_alumno;
	private String alumno;
	private String cod_alumno;
	private String contrasenia;
	private Boolean activo;
	
	public Alumno() {
	}

	public Alumno(Integer id_alumno, String alumno, String cod_alumno, String contrasenia, Boolean activo) {
		this.id_alumno = id_alumno;
		this.alumno = alumno;
		this.cod_alumno = cod_alumno;
		this.contrasenia = contrasenia;
		this.activo = activo;
	}

	public Integer getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(Integer id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getAlumno() {
		return alumno;
	}

	public void setAlumno(String alumno) {
		this.alumno = alumno;
	}

	public String getCod_alumno() {
		return cod_alumno;
	}

	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
}
