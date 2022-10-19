package ptbs;

public class UserInfoItem {
    public enum USER_TYPE {
        Buyer, Seller
    }

    public String name;
    public String password;
    public USER_TYPE type=USER_TYPE.Seller;
}
