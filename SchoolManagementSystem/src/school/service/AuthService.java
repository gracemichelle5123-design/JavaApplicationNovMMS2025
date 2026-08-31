package school.service;
import school.model.*;
public class AuthService { 
    private User loggedInUser;
    public boolean login(String username, String password){
        if(username.equals("admin") && password.equals("1234")){
            loggedInUser=new User("admin","1234",UserRole.ADMIN); 
            return true;
        }
        return false;
    }
}