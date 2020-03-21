package com.mohamedsamir1495.server_app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class ServerAppApplication {



	public static void main(String[] args) {
		SpringApplication.run(ServerAppApplication.class, args);
	}
}
