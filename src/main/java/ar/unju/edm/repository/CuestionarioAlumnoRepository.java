package ar.unju.edm.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.unju.edm.model.CuestionarioAlumno;


@Repository
public interface CuestionarioAlumnoRepository extends CrudRepository<CuestionarioAlumno, Integer> {
}
