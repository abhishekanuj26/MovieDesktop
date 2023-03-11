package com.movie.moviesystem.repository;

import com.movie.moviesystem.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MoviesRepository extends JpaRepository<Movie, Long> {

    List<Movie> findAll();
}
