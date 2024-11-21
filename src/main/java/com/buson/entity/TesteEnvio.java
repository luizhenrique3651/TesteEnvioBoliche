package com.buson.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "teste_envio", schema = "sedex_boliche")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TesteEnvio {

	@Column(name = "cod_envio")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "diametro_bola", nullable = false)
	private Integer diametroBola;
	
	@Column(name = "largura_caixa", nullable = false)
	private Integer larguraCaixa;
	
	@Column(name = "altura_caixa", nullable = false)
	private Integer alturaCaixa;
	
	@Column(name = "profundidade_caixa", nullable = false)
	private Integer profundidadeCaixa;
	
	
}
