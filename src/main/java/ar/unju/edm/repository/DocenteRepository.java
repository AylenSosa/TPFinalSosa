package ar.unju.edm.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.unju.edm.model.Docente;



@Repository
public interface DocenteRepository extends CrudRepository <Docente, Integer>{
	
	 public List<Docente> findByEstado (Boolean estado);

}
