package br.com.herick.bluefood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.herick.bluefood"})
public class BluefoodApplication {
    public static void main(String[] args) {
        SpringApplication.run(BluefoodApplication.class, args);
    }
}
