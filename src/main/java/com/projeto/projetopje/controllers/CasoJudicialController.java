package com.projeto.projetopje.controllers;


import com.projeto.projetopje.model.CasoJudicial;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@RestController
@RequestMapping("/casosjudiciais")
public class CasoJudicialController {



    @GetMapping("/array")
    public ResponseEntity<List<CasoJudicial>> pegarTodosOsCasosArray(){
         return ResponseEntity.ok(casosArray());
    }

    @GetMapping("/list")
    public ResponseEntity<List<CasoJudicial>> pegarTodosOsCasos(){
        return ResponseEntity.ok(casosList());
    }
    public List<CasoJudicial> casosArray() {

         var caso1 =  new CasoJudicial(1L, "Processo A", 1245);
         var caso2 =  new CasoJudicial(2L, "Processo B", 1212);
         var caso3 =  new CasoJudicial(3L, "Processo C", 12440);
         var caso4 =  new CasoJudicial(4L, "Processo D", 4545);
         var caso5 =  new CasoJudicial(5L, "Processo E", 14545);
         return Arrays.asList( caso1, caso2, caso3, caso4, caso5);
    }

    public List<CasoJudicial> casosList(){
        List lista = new ArrayList<>();
        var caso1 =  new CasoJudicial(1L, "Processo A", 1245);
        var caso2 =  new CasoJudicial(2L, "Processo B", 1212);
        var caso3 =  new CasoJudicial(3L, "Processo C", 12440);
        var caso4 =  new CasoJudicial(4L, "Processo D", 4545);
        var caso5 =  new CasoJudicial(5L, "Processo E", 14545);
        lista.add(caso1);
        lista.add(caso2);
        lista.add(caso3);
        lista.add(caso4);
        lista.add(caso5);
        return lista;
    }

}