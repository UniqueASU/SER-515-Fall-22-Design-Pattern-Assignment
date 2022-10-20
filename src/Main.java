import ptbs.Facade;
import ptbs.Login;


public class Main {
    public static void main(String[] args) {
        System.out.println("hello");
        Facade facade = new Facade();

        // User Authentication
//        boolean isValidUser = facade.login();
//        if(isValidUser) {
//            System.out.println("Welcome. Succesfully Logged In");
//        } else {
//            System.out.println("Sorry, you are not registered");
//        }


        Login login= new Login();

        login.setVisible(true);
        login.setModal(true);
//        return login.isExit();

    }
}
