package com.example.michigifs.controller;

import com.example.michigifs.exception.ResourceNotFoundException;
import com.example.michigifs.model.Michi;
import com.example.michigifs.repository.MichiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.module.ResolutionException;
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
    @PostMapping
    public Michi postMichi(@RequestBody Michi michi){
        return michiRepository.save(michi);
    }

    @GetMapping("{id}")
    public ResponseEntity<Michi> getMichiById(@PathVariable long id){
        Michi michi = michiRepository.findById(id).orElseThrow(() -> new ResolutionException("Michi not exist with id:" + id));
        return ResponseEntity.ok(michi);
    }

    @PutMapping("{id}")
    public ResponseEntity<Michi> updateMichi(@PathVariable long id ,@RequestBody Michi michiDetails){
        Michi updateMichi = michiRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Michi not exist with id:" + id));
        updateMichi.setGif_name(michiDetails.getGif_name());
        updateMichi.setGif_url(michiDetails.getGif_url());
        updateMichi.setGif_dimensions(michiDetails.getGif_dimensions());
        michiRepository.save(updateMichi);
        return ResponseEntity.ok(updateMichi);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteMichi(@PathVariable long id){
        Michi michi = michiRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Michi not exist with id:" + id));
        michiRepository.delete(michi);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
