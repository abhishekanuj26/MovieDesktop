package com.movie.moviesystem.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movies implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "movieId",unique = true)
    private String movieId;

    @Column(name="movieName")
    private String movieName;

    @Column(name="watched")
    private Boolean isWatched = false;

}
