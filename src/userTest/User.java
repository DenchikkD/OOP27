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

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        User user = (User) o;
//        if (name != null && !name.equals(user.name)) return false;
//        if (login != null && !login.equals(user.login)) return false;
//        if (user.login == null) return true;
//        if (user.name == null) return true;
//        if (login.equals(user.login) || name.equals(user.name)) return true;
//
//
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = name != null ? name.hashCode() : 0;
//        result = 31 * result + (login != null ? login.hashCode() : 0);
//        return result;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        return login != null ? login.equals(user.login) : user.login == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name= ' " + name + '\'' +
                ", login= '" + login + '\'' +
                ", pass= '" + pass + '\'' +
                ", dateOfExpire= '" + dateOfExpire + '\'' +
                '}' + "\n";
    }
}
