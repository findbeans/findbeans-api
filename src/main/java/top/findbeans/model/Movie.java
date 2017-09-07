package top.findbeans.model;

import lombok.Data;

import java.util.List;

/**
 * Every property from website is string.
 */
@Data
public class Movie {
    private Integer rank;
    private String title;
    private String rating;
    private String director;
    private String description;
    private List<String> actors;
    private List<String> posters; // json String, collect 3-5 pictures
}
