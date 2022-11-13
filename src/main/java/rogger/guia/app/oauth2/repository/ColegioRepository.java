package rogger.guia.app.oauth2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rogger.guia.app.oauth2.model.Colegio;

public interface ColegioRepository extends JpaRepository<Colegio, Integer> {

}
