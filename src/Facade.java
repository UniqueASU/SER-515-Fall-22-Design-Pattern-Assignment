import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;
public class Facade {
    int UserType;
    Product theSelectedProduct;
    int nProductCategory;
    Person thePerson;
    private int userType;
    private int user;
    boolean login() {

        // UserName input
        System.out.println("Please enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine().trim();

        // Password input
        System.out.println("Please enter your password: ");
        String userPassword = scanner.nextLine().trim();

        //Match username and password from file
        HashMap<String, String> buyerUserPassword = new HashMap<String, String>();
        HashMap<String, String> sellerUserPassword = new HashMap<String, String>();

        try {
            File buyerDetails = new File(
                    "BuyerInfo.txt");
            BufferedReader buffRead
                    = new BufferedReader(new FileReader(buyerDetails));
            String text;

            while ((text = buffRead.readLine()) != null) {
                String[] splitArr = text.split(":");
                buyerUserPassword.put(splitArr[0], splitArr[1]);
            }

            File sellerDetails = new File("SellerInfo.txt");
            buffRead
                    = new BufferedReader(new FileReader(sellerDetails));

            while ((text = buffRead.readLine()) != null) {
                String[] splitArr = text.split(":");
                sellerUserPassword.put(splitArr[0], splitArr[1]);
            }

            //set user type
            if (buyerUserPassword.containsKey(username) && buyerUserPassword.get(username).equals(userPassword)) {
                userType = 0;
                return true;
            } else if (sellerUserPassword.containsKey(username) && sellerUserPassword.get(username).equals(userPassword)) {
                userType = 1;
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            System.err.println("There is an error reading the file" + e.getMessage());
        }


        return false;
    }

    public void addTrading() {

    }

    public void viewTrading() {

    }

    public void decideBidding() {

    }

    public void discussBidding() {

    }

    public void submitBidding() {

    }

    public void remind() {

    }

    public void createUser(UserInfoItem userinfoitem) {

    }

    public void createProductList() {

    }

    public void AttachProductToUser() {

    }

    public Product SelectProduct() {
        return null;
    }

    public void productOperation() {

    }





}
