package pe.edu.upeu.Alumno_Carrera.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.Alumno_Carrera.entity.Alumno;


public interface AlumnoService {
	
	Alumno create(Alumno a);
	Alumno update(Alumno a);
	void delete(Long id);
	Optional<Alumno> read(Long id);
	List<Alumno> readAll();

}
