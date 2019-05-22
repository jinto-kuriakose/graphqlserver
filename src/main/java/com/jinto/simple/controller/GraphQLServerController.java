package com.jinto.simple.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public final class GraphQLServerController {

    @GetMapping(value = "/hello")
    public ResponseEntity<String> getAllCurrencyPairs() {
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}