package Credentials;

public class Account {

    private String email;
    private String password;

    public Account(String email, String password) throws PasswordLengthException {
        this.email = email;
        this.setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) throws PasswordLengthException {
        if (password.length() < 8) {
            throw new PasswordLengthException(password.length());
        }
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" + "email=" + email + ", password=" + password + '}';
    }

    public void authenticate() {
    }

    ;
public void changePass() {
    }

    ;
public void resetPass() {
    }

    ;

    public void Register() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
