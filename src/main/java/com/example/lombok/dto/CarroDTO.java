package com.example.lombok.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CarroDTO {
	
	private String cor;
	private String marca;
	private String modelo;
	private String chassi;
	private String placa;
	private String proprietario;
	private Long portas;
	private Date anoFabricacao;

}
