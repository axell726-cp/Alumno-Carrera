package pe.edu.upeu.Alumno_Carrera.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Alumno_Carrera.dao.CarreraDao;
import pe.edu.upeu.Alumno_Carrera.entity.Carrera;
import pe.edu.upeu.Alumno_Carrera.service.CarreraService;

@Service
public class CarreraServiceImpl implements CarreraService{

	@Autowired
	private CarreraDao carreraDao;
	
	@Override
	public Carrera create(Carrera c) {
		// TODO Auto-generated method stub
		return carreraDao.create(c);
	}

	@Override
	public Carrera update(Carrera c) {
		// TODO Auto-generated method stub
		return carreraDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carreraDao.delete(id);
	}

	@Override
	public Optional<Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return carreraDao.read(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return carreraDao.readAll();
	}
	

}
