package com.example.lombok;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.lombok.dto.Carro;
import com.example.lombok.dto.CarroDTO;


/**
 * Adicionar o plugin no eclipse: 
 * Ir no repositório local da instalação do jar do lombok e executar:
 * java -jar lombok.jar
 * @author breno
 *
 */

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		 Carro c = new Carro();
		 c.setCor("prata");
		 c.setMarca("Fiat");
		 System.out.println(c);
		 
		 CarroDTO cDto = new CarroDTO();
		 cDto.setModelo("Onix");
		 cDto.setModelo("Chevrolet");
		 cDto.setPlaca("XYZ-3456");
		 
		 System.out.println(cDto);
		 
	
	}

}
