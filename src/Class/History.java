/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author MYSNACK
 */
public class History {
    private static String userID;
    private static String scoreWin;
    private static String scoreLose;
    private static String status;
    private User user;

    public History(String userID,String status, String scoreWin, String scoreLose,User user) {
        this.userID = userID;
        this.status = status;
        this.scoreWin = scoreWin;
        this.scoreLose = scoreLose;
        this.user = user;
    }

    public static String getUserID() {
        return userID;
    }

    public  void setUserID(String userID) {
        this.userID = userID;
    }

    public static String getScoreWin() {
        return scoreWin;
    }

    public void setScoreWin(String scoreWin) {
        this.scoreWin = scoreWin;
    }

    public static String getScoreLose() {
        return scoreLose;
    }

    public  void setScoreLose(String scoreLose) {
       this.scoreLose = scoreLose;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    } 

    public static String getStatus() {
        return status;
    }

    public static void setStatus(String status) {
        History.status = status;
    }

    
}
