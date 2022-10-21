package PTBS;

public class UserInfoItem {
	public enum USER_TYPE {
		Buyer, Seller
	}
	public String name;
	public USER_TYPE type=USER_TYPE.Seller;
}