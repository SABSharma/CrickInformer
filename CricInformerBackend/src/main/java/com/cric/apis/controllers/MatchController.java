package com.cric.apis.controllers;

import com.cric.apis.entities.Match;
import com.cric.apis.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

    // For Front End Use thi site , to add tail wind css
   // https://tailwindcss.com/docs/guides/angular

    // get live matches
    @Autowired
    private MatchService matchService;

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){

        return  new ResponseEntity<>(matchService.getLiveMatches(), HttpStatus.OK);
    }


    @GetMapping
    public  ResponseEntity<List<Match>> getAllMatches(){

        return  new ResponseEntity<>(matchService.getAllMatches(), HttpStatus.OK);

    }

    @GetMapping("/PointTable")
    public ResponseEntity<?> getIpl2024PointTable(){
        return  new ResponseEntity<>(this.matchService.getIPl2024PointTable(),HttpStatus.OK);
    }


}
