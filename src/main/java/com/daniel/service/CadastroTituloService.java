package com.daniel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.daniel.model.Titulo;
import com.daniel.repository.Titulos;
import com.daniel.repository.filter.TituloFilter;

@Service
public class CadastroTituloService {

	@Autowired
	private Titulos titulos;
	
	public void salvar(Titulo titulo) {
		try {
			titulos.save(titulo);
		} catch (DataIntegrityViolationException e) {
			throw new IllegalArgumentException("Formato de data inválido");
		}
	};

	public void excluir(Long codigo) {
		titulos.delete(codigo);
	};
	
	public List<Titulo> filtrar(TituloFilter filtro) {
		String descricao = filtro.getDescricao() == null ? "%" : filtro.getDescricao();
		return titulos.findByDescricaoContaining(descricao);
	};
	
};
