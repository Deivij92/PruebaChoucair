package co.com.choucair.certificacion.pruebachoucair.model;

public class Password {
    private String password;
    private String  repeatPassword;

    public Password(String password, String repeatPassword) {
        this.password = password;
        this.repeatPassword = repeatPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatPassword() {
        return repeatPassword;
    }

    public void setRepeatPassword(String repeatPassword) {
        this.repeatPassword = repeatPassword;
    }

}
