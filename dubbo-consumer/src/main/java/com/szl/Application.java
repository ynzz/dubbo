package com.szl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author szl
 * @data 2018年7月31日 下午10:02:44
 *
 */
@SpringBootApplication
@ImportResource({"classpath:applicationConsumer.xml"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
