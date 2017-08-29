package top.findbeans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.findbeans.dao.MovieDao;
import top.findbeans.model.Movie;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieDao movieDao;

    @GetMapping("/movies")
    public List<Movie> getMovies(){
        return movieDao.getMovies();
    }

}
