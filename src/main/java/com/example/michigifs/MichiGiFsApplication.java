package com.example.michigifs;

import com.example.michigifs.model.Michi;
import com.example.michigifs.repository.MichiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MichiGiFsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MichiGiFsApplication.class, args);
    }

    @Autowired
    private MichiRepository michiRepository;



}
