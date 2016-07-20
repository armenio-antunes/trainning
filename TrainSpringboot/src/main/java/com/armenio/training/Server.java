package com.armenio.training;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class Server {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "<html><header><title>baam</title></header><body><h3>Hello Maria! Eu sou o servidor no rapberry pi da tua sala! Up and Running! yeeeeeeeyyyy! :)</h3><img style=\"-webkit-user-select: none\" src=\"http://vignette2.wikia.nocookie.net/justdance/images/1/1c/Post-18760-lion-king-meerkat-hula-dancing-5zsd.gif/revision/latest?cb=20150714232455\"></body></html>";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Server.class, args);
	}
}
