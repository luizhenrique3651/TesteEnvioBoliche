package com.buson.validation;

import org.springframework.stereotype.Component;

import com.buson.entity.TesteEnvio;
import com.buson.enums.StatusEnvio;

@Component
public class TesteEnvioValidator {
    public StatusEnvio defineStatus(TesteEnvio teste) {
        if (teste.getDiametroBola() <= teste.getAlturaCaixa() &&
            teste.getDiametroBola() <= teste.getLarguraCaixa() &&
            teste.getDiametroBola() <= teste.getProfundidadeCaixa()) {
            return StatusEnvio.ENVIADO_COM_SUCESSO;
        } else {
            return StatusEnvio.ERRO_NO_ENVIO;
        }
    }
    
}
