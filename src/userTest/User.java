package userTest;

/**
 * Created by Iliren on 24.09.2016.
 */
public class User {

    private String name;
    private String login;
    private String pass;
    private String dateOfExpire;

    public User(String name, String login, String pass, String dateOfExpire) {
        this.name = name;
        this.login = login;
        this.pass = pass;
        this.dateOfExpire = dateOfExpire;
    }

    public String getName() {
        return name;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getDateOfExpire() {
        return dateOfExpire;
    }
}
