package com.buson.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buson.entity.TesteEnvio;
import com.buson.exception.TesteEnvioNotFoundException;
import com.buson.repository.TesteEnvioRepository;
import com.buson.validation.TesteEnvioValidator;

@Service
public class TesteEnvioService {

	private final TesteEnvioRepository repo;
	private final TesteEnvioValidator validator;

	@Autowired
	public TesteEnvioService(TesteEnvioRepository testeEnvioRepository, TesteEnvioValidator validator) {
		this.repo = testeEnvioRepository;
		this.validator = validator;
	}

	public List<TesteEnvio> findAll() {
		return repo.findAll();
	}

	public Optional<TesteEnvio> findById(Long id) {
		return repo.findById(id);
	}

	public TesteEnvio save(TesteEnvio testeEnvio) {
		testeEnvio.setStatusEnvio(validator.defineStatus(testeEnvio));
		return repo.save(testeEnvio);
	}

	public TesteEnvio update(Long id, TesteEnvio testeAtualizado) {
		Optional<TesteEnvio> testeEnvioExistente = repo.findById(id);
		if (testeEnvioExistente.isPresent()) {
			TesteEnvio envio = testeEnvioExistente.get();
			envio.setDiametroBola(testeAtualizado.getDiametroBola());
			envio.setAlturaCaixa(testeAtualizado.getAlturaCaixa());
			envio.setLarguraCaixa(testeAtualizado.getLarguraCaixa());
			envio.setProfundidadeCaixa(testeAtualizado.getProfundidadeCaixa());
			envio.setStatusEnvio(validator.defineStatus(testeAtualizado));
			return repo.save(envio);
		} else {
			throw new TesteEnvioNotFoundException(id);
		}
	}
	
	public void delete(Long id) {
		if(repo.existsById(id)) {
			repo.deleteById(id);
		}else {
			throw new TesteEnvioNotFoundException(id);
        }
	}

}
