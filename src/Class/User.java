package Class;

import com.mongodb.DBObject;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FRAME
 */

public class User {
    private String userID;
    private String name;
    private String username;
    private String password;
    private String picture;
    private int score;
    private History[] history;

    public User(String name, String username, String password, String picture) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.picture = picture;
        this.score = 0;
        this.history = new History[0]; 
    }
    
     public User(DBObject obj){
        this.name = obj.get("name").toString();
        this.username = obj.get("username").toString();
        this.password = obj.get("password").toString();
        this.score = (int)obj.get("score");
        this.picture = obj.get("picture").toString();
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public History[] getHistore() {
        return history;
    }

    public void setHistore(ArrayList<History> histore) {
        this.history = history;
    }
    
    
    
    
}
