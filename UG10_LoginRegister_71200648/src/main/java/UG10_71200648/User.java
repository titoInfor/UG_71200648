package UG10_71200648;

public class User {
    private String username;
    private String email;
    private String password;

    public User(String username,String email,String password){
        this.username =username;
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
