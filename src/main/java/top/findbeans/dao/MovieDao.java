package top.findbeans.dao;

import com.google.gson.Gson;
import org.bson.Document;
import org.springframework.stereotype.Repository;
import top.findbeans.model.Movie;
import top.findbeans.mongo.MongoDB;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieDao {

    public List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        Gson gson = new Gson();
        for (Document document : MongoDB.mongoMovie.find()) {
            document.remove("_id");
            movies.add(gson.fromJson(document.toJson(), Movie.class));
        }
        return movies;
    }
}
