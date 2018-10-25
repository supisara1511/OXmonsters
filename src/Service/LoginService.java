/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;
import Class.User;
import Database.UserDao;

/**
 *
 * @author MYSNACK
 */
public class LoginService {
    private User user;
   

    public static int checkUser(String username, String password) { 
        User user = UserDao.get(username);
        if(user == null){
            return 1;
        }else if(username.equals(user.getUsername()) && password.equals(user.getPassword())){
            return 0;
        }else{
             return 2;
        }
       
    }
    
    public static User getUser(String username){   
        User user = UserDao.get(username);
        System.out.println(user);
        return user;
    }
    
    

   
}
