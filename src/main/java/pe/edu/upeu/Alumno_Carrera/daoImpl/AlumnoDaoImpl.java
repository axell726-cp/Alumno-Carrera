package pe.edu.upeu.Alumno_Carrera.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.Alumno_Carrera.dao.AlumnoDao;
import pe.edu.upeu.Alumno_Carrera.entity.Alumno;
import pe.edu.upeu.Alumno_Carrera.repository.AlumnoRepository;

@Component
public class AlumnoDaoImpl implements AlumnoDao {
	
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	public Alumno create(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(a);
	}

	@Override
	public Alumno update(Alumno a) {
		// TODO Auto-generated method stub
		return alumnoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		alumnoRepository.deleteById(id);
	}

	@Override
	public Optional<Alumno> read(Long id) {
		// TODO Auto-generated method stub
		return alumnoRepository.findById(id);
	}

	@Override
	public List<Alumno> readAll() {
		// TODO Auto-generated method stub
		return alumnoRepository.findAll();
	}

}
