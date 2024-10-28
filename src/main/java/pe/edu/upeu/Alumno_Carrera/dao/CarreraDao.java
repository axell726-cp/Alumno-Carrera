package pe.edu.upeu.Alumno_Carrera.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.Alumno_Carrera.entity.Carrera;


public interface CarreraDao {
	Carrera create(Carrera c);
	Carrera update(Carrera c);
	void delete(Long id);
	Optional<Carrera> read(Long id);
	List<Carrera> readAll();

}
