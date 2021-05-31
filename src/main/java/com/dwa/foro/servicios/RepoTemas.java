package com.dwa.foro.servicios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.dwa.foro.modelo.Tema;
import java.util.ArrayList;

public interface RepoTemas extends CrudRepository<Tema, Integer> {

	@Query(value = "SELECT * FROM temas", nativeQuery = true)
	ArrayList<Tema> todos();
	
}
