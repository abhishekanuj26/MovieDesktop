package com.movie.moviesystem.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Movie implements Serializable {
    @JsonProperty("Title")
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
    String imdbId;
    @JsonProperty("Type")
    String type;

}
