package pe.edu.upeu.Alumno_Carrera.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.Alumno_Carrera.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
	

}
