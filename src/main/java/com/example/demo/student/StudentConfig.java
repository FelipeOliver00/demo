package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;

import java.util.List;


@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
         Student felipe =  new Student(
                    1L,
                    "Felipe",
                    "felipe.teste@gmail.com",
                    LocalDate.of(1998, Month.FEBRUARY, 8)

            );
            Student Jose =  new Student(
                    2L,
                    "Jose",
                    "jose.teste@gmail.com",
                    LocalDate.of(2005, Month.FEBRUARY, 17)

            );

            repository.saveAll(
                    List.of(felipe,Jose)
            );
        };
    }

}
