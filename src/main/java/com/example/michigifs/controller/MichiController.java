package com.example.michigifs.controller;

import com.example.michigifs.model.Michi;
import com.example.michigifs.repository.MichiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/michi")
public class MichiController {

    @Autowired
    private MichiRepository michiRepository;

    @GetMapping
    public List<Michi> getAllMichiGifs(){
        return michiRepository.findAll();
    }
}
