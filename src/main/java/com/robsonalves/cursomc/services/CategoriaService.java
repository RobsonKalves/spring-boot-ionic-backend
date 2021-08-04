package com.robsonalves.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.robsonalves.cursomc.domain.Categoria;
import com.robsonalves.cursomc.repositories.CategoriaRepository;
import com.robsonalves.cursomc.services.exception.DataIntegrityException;
import com.robsonalves.cursomc.services.exception.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));

	}

	public Categoria insert(Categoria obj) {
		
		obj.setId(null);
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		
		find(obj.getId()); //verifica se realmente existe um id para atualizar..
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		
		find(id);
		
		try {
			
			repo.deleteById(id);
			
		} catch (DataIntegrityViolationException e) {
			
			throw new DataIntegrityException("Não é possível excluir uma categoria que possui produtos!");
		}
		
	}

}
