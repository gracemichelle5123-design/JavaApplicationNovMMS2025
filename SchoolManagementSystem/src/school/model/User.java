package school.model;
public class User { 
    private String username; 
    private String password; 
    private UserRole role;
    public User(String u, String p, UserRole r){
        username=u; 
        password=p; 
        role=r;
    } 
    public UserRole getRole(){return role;}
}