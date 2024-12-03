package com.exercises;


import com.exercises.asciishapes.CustomTriangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExercisesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExercisesApplication.class, args);

        CustomTriangle triangle = new CustomTriangle();
        triangle.drawShape();
    }
}
