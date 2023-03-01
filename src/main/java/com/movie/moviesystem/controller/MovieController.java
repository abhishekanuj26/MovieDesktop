package com.movie.moviesystem.controller;

import com.movie.moviesystem.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/getSystemMovies")
    public ResponseEntity<List<File>> getSystemMovies(@RequestParam String folder){

        return new ResponseEntity<>(movieService.getMoviesInSystem(folder), HttpStatus.OK);
    }

}
