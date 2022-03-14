package Credentials;

public class PasswordLengthException extends Exception {

    public PasswordLengthException(int Length) {
        super("Your password is too short: Only " + Length + "/8 characters are entered");
    }

}
