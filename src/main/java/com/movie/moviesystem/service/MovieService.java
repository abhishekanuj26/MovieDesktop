package com.movie.moviesystem.service;

import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {


    public List<File> getMoviesInSystem(String folderPath) {
        File folder = new File(folderPath);
        File[] files = folder.listFiles();
        if (files == null) {
            return null;
        }
        return Arrays.stream(files)
                .filter(File::isDirectory)
                .collect(Collectors.toList());
    }

    public void getMoviesFromImdb(){

    }

}

