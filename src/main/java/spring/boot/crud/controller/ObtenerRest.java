package spring.boot.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping("/api-obtenersaludo")
public class ObtenerRest {
	
		
	
	@GetMapping("/saludo_aux")
	String saludo_aux() {
        RestTemplate plantilla = new RestTemplate();
        String resultado = plantilla.getForObject("http://saludo-juan-maldonado02-dev.apps.sandbox-m2.ll9k.p1.openshiftapps.com/api/", String.class);
        return "Obtiene el saludo desde otro servicio "+resultado;
	}
	
	
	@GetMapping("/saludo_aux2/{nombre}")
	String saludo_aux2( @PathVariable String nombre) {
        RestTemplate plantilla = new RestTemplate();
        String resultado = plantilla.getForObject("http://saludo-juan-benavides-dev.apps.sandbox-m2.ll9k.p1.openshiftapps.com/api/saludo/"+nombre, String.class);
        return "Obtiene el saludo desde otro servicio "+resultado;
	}
	
	
}

