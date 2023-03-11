package com.movie.moviesystem.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="movies")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @JsonProperty("Title")
    @Column(name="movieName")
    String title;
    @JsonProperty("Released")
    String released;
    @JsonProperty("Plot")
    String plot;
    @JsonProperty("Poster")
    String poster;
    @JsonProperty("imdbRating")
    String imdbRating;
    @JsonProperty("imdbID")
    @Column(name = "movieId")
    String imdbId;
    @JsonProperty("Type")
    String type;

    @Column(name="watched")
    private Boolean isWatched = false;
}
