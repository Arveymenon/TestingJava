package com.example.demo.student;

import net.bytebuddy.utility.RandomString;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
            return args -> {

                List<Student> students = new ArrayList<>();
                for(int i = 0; i < 10; i++){
                    int date = 1 + (int) (Math.random() * 10);
                    int month = 1 + (int) (Math.random() * 10);
                    int year = 2000 + (int)((Math.random() * 10));

                    students.add(
                        new Student(
                                "Student "+(i + 1),
                                "email",
                                LocalDate.of(year, Month.of(month), date),
                                25 + i
                        )
                    );
                }
                repository.saveAll(students);
            };
    }
}
