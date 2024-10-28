package pe.edu.upeu.Alumno_Carrera.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.Alumno_Carrera.dao.CarreraDao;
import pe.edu.upeu.Alumno_Carrera.entity.Carrera;
import pe.edu.upeu.Alumno_Carrera.repository.CarreraRepository;

@Component
public class CarreraDaoImpl implements CarreraDao {
	
	@Autowired
	private CarreraRepository carreraRepository;

	@Override
	public Carrera create(Carrera c) {
		// TODO Auto-generated method stub
		return carreraRepository.save(c);
	}

	@Override
	public Carrera update(Carrera c) {
		// TODO Auto-generated method stub
		return carreraRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carreraRepository.deleteById(id);
	}

	@Override
	public Optional<Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return carreraRepository.findById(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return carreraRepository.findAll();
	}

}
