package com.movie.moviesystem.controller;

import com.movie.moviesystem.models.Movie;
import com.movie.moviesystem.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class MovieController {

    @Autowired
    MovieService movieService;

    @GetMapping("/getSystemMovies")
    public ResponseEntity<List<Movie>> getSystemMovies(@RequestParam String name){
        return new ResponseEntity<>(movieService.getMoviesInSystem(name), HttpStatus.OK);
    }
    @GetMapping("searchMovies")
    public ResponseEntity<Movie> getMovie(@RequestParam String name){
        return new ResponseEntity<>(movieService.getMoviesFromImdb(name),HttpStatus.OK);
    }



}
