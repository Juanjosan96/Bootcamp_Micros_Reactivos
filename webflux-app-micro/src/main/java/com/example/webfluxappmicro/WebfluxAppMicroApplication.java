package com.example.webfluxappmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.example.*;

@SpringBootApplication
@ResponseStatus(value = HttpStatus.NOT_FOUND)
@ResponseBody
//@ComponentScan({"com.example.Controller", "com.example.service" })
//@ComponentScan(basePackages = "com.example.Controller")
public class WebfluxAppMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxAppMicroApplication.class, args);
	}

}
