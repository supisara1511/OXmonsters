package Database;

import Class.User;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import helpers.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.FileUtils;
import org.bson.Document;
import org.bson.conversions.Bson;

public class UserDao {

    private static int port;
    private static MongoClient mongo;
    private static MongoDatabase db;
    private static MongoCollection<Document> collection;
    private static MongoCredential credential;

    public UserDao() {
        this.port = 27017;
        this.mongo = new MongoClient("localhost", port);
        this.db = mongo.getDatabase("OX");
    }

    public static boolean insert(User user) {
        port = 27017;
        mongo = new MongoClient("localhost", port);
        db = mongo.getDatabase("OX");
        collection = db.getCollection("users");
        Document doc = new Document();
        try {
            doc.put("name", user.getName());
            doc.put("username", user.getUsername());
            doc.put("password", user.getPassword());
            doc.put("score", user.getScore());
            doc.put("pic", Image.fileToBase64StringConversion(user.getPicture()));
            collection.insertOne(doc);
            return true;
        } catch (Exception ex) {
            System.out.println("ERROR");
            return false;

        }
    }

    public static int delete(User user) {
        MongoCollection<Document> doc = db.getCollection("users");
        doc.deleteOne(new Document("name", user.getName()));
        return 0;
    }

    public static ArrayList getAll() {
        DB database = mongo.getDB("OX");
        DBCollection coll = database.getCollection("users");
        DBCursor cursor = coll.find();
        ArrayList<User> user = new ArrayList<>();
        while (cursor.hasNext()) {
            DBObject obj = cursor.next();
            user.add(new User(obj));
        }
        return user;
    }

    public static User get(String username) {
        port = 27017;
        mongo = new MongoClient("localhost", port);
        db = mongo.getDatabase("OX");
        DB database = mongo.getDB("OX");
        DBCollection coll = database.getCollection("users");
        DBObject query = new BasicDBObject();
        query.put("username", username);
        DBObject result = coll.findOne(query);
        if (result == null) {
            return null;
        } else {
            User user = new User(result);
            System.out.println(user);
            return user;
        }

    }

}
