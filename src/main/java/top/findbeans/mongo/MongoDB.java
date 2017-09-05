package top.findbeans.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@Repository
public class MongoDB {

    @Autowired
    private MongoClient mongoClient;

    @Bean
    public MongoDatabase getMongoDatabase() {
        return mongoClient.getDatabase("findbeans");
    }

    // define Collections
    @Bean
    public MongoCollection<Document> getMongoMovie() {
        return getMongoDatabase().getCollection("movie");
    }
}
