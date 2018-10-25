/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Class.History;
import Class.User;
import Database.UserDao;
import java.util.ArrayList;

/**
 *
 * @author MYSNACK
 */
public class LobbyService {

    private static User user;
    private static User player;
    private static ArrayList<User> arrUser = new ArrayList<User>();
    private static ArrayList<History> history = new ArrayList<History>();

    public static ArrayList<User> getPlaerAll() {
        arrUser = UserDao.getAll();
        System.out.println(arrUser);
        return arrUser;
    }

    public static User getUser(String username) {
        user = new User("snack", "supisara1511", "123456789", "123456");
        return user;
    }

    public static User searchPlayer(String username) {
        player = new User("snack", "supisara1511", "123456789", "123456");
        return player;
    }

    public static ArrayList<History> getHistory(String username) {
        for (int i = 0; i < 2; i++) {
            history.add(new History("snack","แพ้","1", "3",user));
        }
        return history;
    }
}
