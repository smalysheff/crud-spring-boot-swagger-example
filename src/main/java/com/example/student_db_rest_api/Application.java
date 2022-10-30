package com.example.student_db_rest_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.student_db_rest_api.repository.SpecialtyRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);

        SpecialtyRepository specialtyRepository = run.getBean(SpecialtyRepository.class);
//
//        Specialty specialty = new Specialty();
//
//        specialty.setUpdated(LocalDateTime.now());
//        specialty.setUpdatedBy("SMALL");
//        specialty.setName("Information system");
//        specialty.setCode("22t");


//        Specialty specialty = specialtyRepository.findById(UUID.fromString("6429f66d-6d56-4efc-8fdb-84b21afa002a")).get();
//
//        specialty.setUpdated(LocalDateTime.now());
//        specialty.setUpdatedBy("Ivan");

//        specialtyRepository.save(specialty);



    }

}
