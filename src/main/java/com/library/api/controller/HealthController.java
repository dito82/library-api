
package com.library.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/*Define uma classe que disponibiliza endpoints REST*/
@RestController
/* Define o caminho base das rotas */
@RequestMapping("/api")
public class HealthController {

	/* Mapeia requisições HTTP GET */
	@GetMapping("/health")
	public String health() {
		return "Library API está funcionando!";
	}
}
