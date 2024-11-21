package com.buson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buson.dto.TesteEnvioRequestDTO;
import com.buson.dto.TesteEnvioResponseDTO;
import com.buson.entity.TesteEnvio;
import com.buson.service.TesteEnvioService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping("/teste-envio")
public class TesteEnvioController {

    private final TesteEnvioService service;

    @Autowired
    public TesteEnvioController(TesteEnvioService service) {
        this.service = service;
    }

    @Operation(summary = "Carrega todos os testes de envio", description = "Retorna uma lista de testes de envio.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de testes de envio retornada com sucesso")
    })
    @GetMapping
    public List<TesteEnvioResponseDTO> loadAll() {
        return service.findAll().stream().map(TesteEnvioResponseDTO::new).toList();
    }

    @Operation(summary = "Busca um teste de envio por ID", description = "Retorna os dados de um teste de envio específico.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Teste de envio encontrado"),
        @ApiResponse(responseCode = "404", description = "Teste de envio não encontrado")
    })
    @GetMapping("/{id}")
    public ResponseEntity<TesteEnvioResponseDTO> findById(@PathVariable Long id) {
        return service.findById(id)
                .map(teste -> ResponseEntity.ok(new TesteEnvioResponseDTO(teste)))
                .orElse(ResponseEntity.notFound().build());
    }

    @Operation(summary = "Cadastra um novo teste de envio", description = "Adiciona um novo teste de envio ao sistema.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Teste de envio cadastrado com sucesso")
    })
    @PostMapping
    public ResponseEntity<TesteEnvioResponseDTO> saveTesteEnvio(@RequestBody TesteEnvioRequestDTO data) {
        TesteEnvio novoTeste = new TesteEnvio(data);
        TesteEnvio savedTeste = service.save(novoTeste);
        return ResponseEntity.status(HttpStatus.CREATED).body(new TesteEnvioResponseDTO(savedTeste));
    }

    @Operation(summary = "Atualiza um teste de envio", description = "Modifica os dados de um teste de envio existente.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Teste de envio atualizado com sucesso"),
        @ApiResponse(responseCode = "404", description = "Teste de envio não encontrado")
    })
    @PutMapping("/{id}")
    public ResponseEntity<TesteEnvioResponseDTO> updateTesteEnvio(@PathVariable Long id, @RequestBody TesteEnvioRequestDTO data) {
        TesteEnvio testeAtualizado = new TesteEnvio(data);
        TesteEnvio updatedTeste = service.update(id, testeAtualizado);
        return ResponseEntity.ok(new TesteEnvioResponseDTO(updatedTeste));
    }

    @Operation(summary = "Exclui um teste de envio", description = "Remove um teste de envio do sistema.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "204", description = "Teste de envio excluído com sucesso"),
        @ApiResponse(responseCode = "404", description = "Teste de envio não encontrado")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTesteEnvio(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
