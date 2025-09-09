package overloadingTask;

public class FacebookLogin {
    public void login(long phno, String pwd1) {
        System.out.println("login done via phone number");
    }
    
    public void login(String email, String password) {
        System.out.println("login done via email");
    }
}
