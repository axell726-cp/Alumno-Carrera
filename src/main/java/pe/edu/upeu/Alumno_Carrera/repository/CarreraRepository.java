package pe.edu.upeu.Alumno_Carrera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Alumno_Carrera.entity.Carrera;

@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {
	

}
