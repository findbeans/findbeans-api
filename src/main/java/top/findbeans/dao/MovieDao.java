package top.findbeans.dao;

import com.google.gson.Gson;
import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
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

    public List<Movie> getMovies(Integer count) {

        List<Movie> movies = new ArrayList<>();
        Gson gson = new Gson();
        FindIterable<Document> documents = mongoMovie.find().limit(count).sort(new BasicDBObject("rank", 1));
        for (Document document : documents) {
            movies.add(gson.fromJson(document.toJson(), Movie.class));
        }
        return movies;
    }

}
