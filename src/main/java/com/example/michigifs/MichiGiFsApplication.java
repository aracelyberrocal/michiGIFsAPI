package com.example.michigifs;

import com.example.michigifs.model.Michi;
import com.example.michigifs.repository.MichiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MichiGiFsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MichiGiFsApplication.class, args);
    }

    @Autowired
    private MichiRepository michiRepository;

    @Override
    public void run(String... args) throws Exception{
        Michi michi = new Michi();
        michi.setGif_name("Cat Laugh");
        michi.setGif_url("https://c.tenor.com/ryp18LniYBsAAAAd/cat-laugh.gif");
        michi.setGif_dimensions("498x401");
        michiRepository.save(michi);
    }

}
