package com.movie.moviesystem.service;

import com.movie.moviesystem.models.Movie;
import com.movie.moviesystem.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {

    @Autowired
    MoviesRepository moviesRepository;

    public List<Movie> getMoviesInSystem(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files == null) {
            return null;
        }
        List<String> moviesInSystem = Arrays.stream(files)
                .filter(File::isDirectory)
                .map(File::getName)
                .collect(Collectors.toList());
        List<Movie> movieDetailsInSystem = new ArrayList<>();
        for (String movie : moviesInSystem) {
            Movie movieDetails = getMoviesFromImdb(movie);
            movieDetailsInSystem.add(movieDetails);
        }

        return movieDetailsInSystem;


    }

    public Movie getMoviesFromImdb(String name) {
        RestTemplate restTemplate = new RestTemplate();
        Movie movie = restTemplate.getForObject("http://www.omdbapi.com/?" + "t=" + name + "&apikey=1ca2464a", Movie.class);
        System.out.println(movie);
        assert movie != null;
        moviesRepository.save(movie);
        return movie;
    }
}

