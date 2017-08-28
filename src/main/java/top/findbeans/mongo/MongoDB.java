package top.findbeans.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MongoDB {

    private static final MongoClient mongoClient = new MongoClient();
    private static final MongoDatabase mongoDatabase = mongoClient.getDatabase("findbeans");

    // define databases
    public static final MongoCollection<Document> mongoMovie = MongoDB.mongoDatabase.getCollection("movie");

}
