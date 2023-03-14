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
    private String title;
    @JsonProperty("Released")
    private String released;
    @JsonProperty("Plot")
    private String plot;
    @JsonProperty("Poster")
    private String poster;
    @JsonProperty("imdbRating")
    private String imdbRating;
    @JsonProperty("imdbID")
    private String imdbId;
    @JsonProperty("Type")
    private String type;

}