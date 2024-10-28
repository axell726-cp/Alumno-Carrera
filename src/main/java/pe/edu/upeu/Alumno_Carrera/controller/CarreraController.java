package pe.edu.upeu.Alumno_Carrera.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.Alumno_Carrera.entity.Carrera;
import pe.edu.upeu.Alumno_Carrera.service.CarreraService;



@RestController
@CrossOrigin(origins = "http://localhost:4200/")
@RequestMapping("api/carreras")
public class CarreraController {

	@Autowired
	private CarreraService carreraService;
	
	@GetMapping
	public ResponseEntity<List<Carrera>> readAll(){
		try {
			List<Carrera> Carreras = carreraService.readAll();
			if(Carreras.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(Carreras, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	
	

	@PostMapping
	public ResponseEntity<Carrera> crear(@Valid @RequestBody Carrera car){
		try {
			Carrera c = carreraService.create(car);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Carrera> getCarrera(@PathVariable("id") Long id) {
		
		try {
			Carrera c = carreraService.read(id).get();
			return new ResponseEntity<>(c, HttpStatus.CREATED);
			
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Carrera> delCarrera(@PathVariable("id") Long id){
		try {
			 carreraService.delete(id);
			 return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCarrera(@PathVariable("id") Long id, @Valid @RequestBody Carrera car){

			Optional<Carrera> c = carreraService.read(id);
			if(!c.isEmpty()) {
				return new ResponseEntity<>(carreraService.update(car), HttpStatus.OK);
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}		
		
	}
	
	
}
