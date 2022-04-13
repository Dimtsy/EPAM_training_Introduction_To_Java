package task6.library.user;

public class User {
    private String login;
    private int passwordHash;
    private boolean admin;

    public User(String login, int passwordHash, boolean admin) {
        this.login = login;
        this.passwordHash = passwordHash;
        this.admin = admin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(int passwordHash) {
        this.passwordHash = passwordHash;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
