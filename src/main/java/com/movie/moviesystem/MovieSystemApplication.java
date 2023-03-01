package com.movie.moviesystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MovieSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieSystemApplication.class, args);

    }

}
