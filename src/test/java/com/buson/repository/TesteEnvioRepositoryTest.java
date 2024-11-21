package com.buson.repository;

import com.buson.entity.TesteEnvio;
import com.buson.enums.StatusEnvio;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ActiveProfiles("test")
public class TesteEnvioRepositoryTest {

    @Autowired
    private TesteEnvioRepository repo;

    private TesteEnvio testeEnvio;

    @BeforeEach
    void setUp() {
        testeEnvio = new TesteEnvio();
        testeEnvio.setDiametroBola(10);
        testeEnvio.setLarguraCaixa(15);
        testeEnvio.setAlturaCaixa(15);
        testeEnvio.setProfundidadeCaixa(15);
        testeEnvio.setStatusEnvio(StatusEnvio.ENVIADO_COM_SUCESSO);
    }

    @Test
    void shouldSaveTesteEnvio() {
        TesteEnvio savedTeste = repo.save(testeEnvio);

        assertNotNull(savedTeste);
        assertEquals(testeEnvio.getDiametroBola(), savedTeste.getDiametroBola());
    }

    @Test
    void shouldFindTesteEnvioById() {
        TesteEnvio savedTeste = repo.save(testeEnvio);
        TesteEnvio foundTeste = repo.findById(savedTeste.getId()).orElse(null);

        assertNotNull(foundTeste);
        assertEquals(savedTeste.getId(), foundTeste.getId());
    }

    @Test
    void shouldDeleteTesteEnvio() {
        TesteEnvio savedTeste = repo.save(testeEnvio);
        repo.deleteById(savedTeste.getId());

        assertFalse(repo.existsById(savedTeste.getId()));
    }
}
