/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import Class.User;
import Class.User;
import Database.UserDao;
/**
 *
 * @author MYSNACK
 */
public class WelcomeService {
    private User user;
    
    
    public static User getUser(String username){   
        User user = UserDao.get(username);
        System.out.println(user);
         return user;
    }
}
