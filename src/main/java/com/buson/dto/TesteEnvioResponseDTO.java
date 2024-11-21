package com.buson.dto;

import com.buson.entity.TesteEnvio;
import com.buson.enums.StatusEnvio;

public record TesteEnvioResponseDTO(Long id, Integer diametroBola, Integer larguraCaixa, Integer alturaCaixa,
		Integer profundidadeCaixa, StatusEnvio statusEnvio) {

	public TesteEnvioResponseDTO(TesteEnvio testeEnvio) {
		this(testeEnvio.getId(), testeEnvio.getDiametroBola(), testeEnvio.getLarguraCaixa(),
				testeEnvio.getAlturaCaixa(), testeEnvio.getProfundidadeCaixa(), testeEnvio.getStatusEnvio());
	}
}
