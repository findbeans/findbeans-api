package top.findbeans.dao;

import com.google.gson.Gson;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import top.findbeans.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieDao{

    @Autowired
    private MongoCollection<Document> mongoMovie;

    public List<Movie> getMovies() {

        List<Movie> movies = new ArrayList<>();
        Gson gson = new Gson();
        for (Document document : mongoMovie.find()) {
            movies.add(gson.fromJson(document.toJson(), Movie.class));
        }
        return movies;
    }

}
