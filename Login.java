import java.util.Objects;

public class Login {
    private String username;
    private String password;
    private Register loginInfo;

    public Login (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Register getLoginInfo() {
        return loginInfo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validateLogin() {
        return Objects.equals(loginInfo.getUsername(), username) && Objects.equals(loginInfo.getPassword(), password);
    }
}
