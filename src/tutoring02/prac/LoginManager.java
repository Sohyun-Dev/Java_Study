package tutoring02.prac;

public class LoginManager {
    private String id;
    private String password;
    public LoginManager() {
        id = "tutoring";
        password = "123";
    }
    public void login(String id, String password) throws WrongIdException, WrongPasswordException {
        if (!id.equals(this.id)) {
            throw new WrongIdException();
        } else if (!password.equals(this.password)) {
            throw new WrongPasswordException();
        }
    }
}
