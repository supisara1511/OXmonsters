package Class;

import com.mongodb.DBObject;
import java.util.ArrayList;

public class User {

    private String userID;
    private String name;
    private String username;
    private String password;
    private String picture;
    private double score;
    private History[] history;

    public User(String name, String username, String password, String picture) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.picture = picture;
        this.score = 0.0f;
    }

    public User(DBObject obj) {
        System.out.println(obj);
        this.name = obj.get("name").toString();
        this.username = obj.get("username").toString();
        this.password = obj.get("password").toString();
        this.score = Double.parseDouble(obj.get("score").toString()) ;
        System.out.println(score);
        this.picture = obj.get("pic").toString();
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public double getScore() {
        return this.score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public History[] getHistore() {
        return history;
    }

    public void setHistore(ArrayList<History> histore) {
        this.history = history;
    }

}
