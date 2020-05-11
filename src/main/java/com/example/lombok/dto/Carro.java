package com.example.lombok.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = {"anoFabricacao", "portas"})
@EqualsAndHashCode(exclude = {"anoFabricacao", "portas"})
public class Carro {
	
	private String cor;
	private String marca;
	private String modelo;
	private String chassi;
	private String placa;
	private String proprietario;
	private Long portas;
	private Date anoFabricacao;

}
