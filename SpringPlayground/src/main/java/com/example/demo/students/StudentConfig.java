package com.example.demo.students;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        Faker faker = new Faker();


        return args -> {
            List<Student> students = new ArrayList<>();

            for (int i = 0; i < 1000; i++) {
                Student student = new Student();
                student
                        .setName(faker.name().fullName())
                        .setStandard((int) Math.ceil(Math.random() * 10))
                        .setEmail(faker.name().firstName().toLowerCase()+"@gmail.com")
                        .setDivision(DivisionEnum.values()[new Random().nextInt(DivisionEnum.values().length)]);
                students.add(student);
            }

            repository.saveAll(students);
        };

    }
}
