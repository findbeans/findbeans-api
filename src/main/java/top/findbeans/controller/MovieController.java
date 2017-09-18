package top.findbeans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import top.findbeans.dao.MovieDao;
import top.findbeans.model.Movie;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    private MovieDao movieDao;

    @GetMapping("/movie")
    public List<Movie> getMovies(@RequestParam(defaultValue = "10", required = false) Integer count){
        return movieDao.getMovies(count);
    }

}
