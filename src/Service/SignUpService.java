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
public class SignUpService {
    private User user;

    public static boolean checkUserExist(String username) {
        return true;
    }

    public static boolean checkStrongPassword(String password) {
        if(password.length() >= 8){
            return true;
        }else{
            return false;
        }  
    }

    public static boolean matchPassword(String password, String confirmpassword) {
        if (password.equals(confirmpassword)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean addUser(User user) {
        return UserDao.insert(user);
    }
    
   

}
