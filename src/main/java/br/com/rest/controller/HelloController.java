package br.com.rest.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/{nome}")
    public ResponseEntity<String> hello(@PathVariable String nome) {
        return ResponseEntity.ok(String.format("Ola %s como vai?", nome));
    }
}
