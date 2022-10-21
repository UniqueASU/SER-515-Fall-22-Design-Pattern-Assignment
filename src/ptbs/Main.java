package PTBS;


public class Main {
	public static Facade facade = new Facade();

	public static void main(String[] args) {
		UserInfoItem user = new UserInfoItem();
		boolean switchVal = false;
		switchVal = Facade.login(user);
		if (switchVal) System.exit(0);





//            try{
//                String pname = null;
//                File productDetails = new File("ProductIno.txt");
//
//                System.out.println("hello2");
//                BufferedReader file = new BufferedReader(new FileReader(productDetails));
//                System.out.println(file.readLine());
////                while ((pname = file.readLine()) != null) {
////                    Product product;
////                    int div = pname.lastIndexOf(':');
////                    product = new Product(pname.substring(div+1,pname.length()), pname.substring(0,div));
////                    add(product);
////                }
//                file.close();
//            } catch (Exception e)  {
//
//            };


		// User Authentication
//        boolean isValidUser = facade.login();
//        if(isValidUser) {
//            System.out.println("Welcome. Succesfully Logged In");
//        } else {
//            System.out.println("Sorry, you are not registered");
//        }


//        Login login= new Login();
//
//        login.setVisible(true);
//        login.setModal(true);
//        return login.isExit();

	}
}
