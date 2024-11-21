package com.buson.dto;

import com.buson.enums.StatusEnvio;

public record TesteEnvioRequestDTO(Integer diametroBola, Integer larguraCaixa, Integer alturaCaixa,
		Integer profundidadeCaixa, StatusEnvio statusEnvio) {

}
