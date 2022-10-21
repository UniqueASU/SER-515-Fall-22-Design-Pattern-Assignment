package PTBS;
import java.io.*;

// implementation of Facade design pattern
public class Facade {

	public int userType;

	private Product SProduct = null;

	private int nProductCategory = 0;

	public ClassProductList productList;

	public Person thePerson;

	public Facade() {

	}

	public static boolean login(UserInfoItem user) {

		System.out.println("LOGIN");
		Login login= new Login();

		login.setVisible(true);
		login.setModal(true);
		return login.isExit();



	}

	public void addTrading(Product product) {
        // read file and store values to the text file

		TradingMenu trademenu;
		if (thePerson.type == 0) {

			trademenu = new BuyerTradingMenu();
		}

		else {
			trademenu = new SellerTradingMenu();
		}


		Trading trade = new Trading();
		trademenu.ShowMenu(trade, thePerson);
		product.AddTrading(trade);
	}

	public void viewTrading(Trading trade) {
		TradingMenu trademenu;
		// if buyer
		if(thePerson.type == 0) {
			trademenu = new BuyerTradingMenu();
		}
		else { // if seller
			trademenu = new SellerTradingMenu();
		}
		trademenu.ShowMenu(trade, thePerson );

	}
// set the bidding price
	public void decideBidding(Offering offer) {
			OfferingMenu offerMenu = new OfferingMenu();
			offerMenu.ShowMenu(offer);
	}

	public void discussBidding() {

	}

	public void submitBidding(Trading trade, Offering offer) {

		trade.AddOffering(offer);
	}

	public void remind() {
		Reminder rem = new Reminder();
		rem.showReminder(thePerson.GetProductList());
	}

	public void createUser(UserInfoItem userinfoitem) {
		// User is a Buyer
		if(userinfoitem.type == UserInfoItem.USER_TYPE.Buyer) {
			thePerson = new Buyer();
		}
		// User is a Seller
		else {
			thePerson = new Seller();
		}

		thePerson.userName = userinfoitem.name;
	}

	public void createProductList() {
		productList = new ClassProductList();
		productList.ReadFile("ProductInfo.txt");
		System.err.println(productList);
	}

	public void AttachProductToUser() {
		BufferedReader f;
		try {
			String name,uName, pName;
			f = new BufferedReader(new FileReader("UserProduct.txt"));
			while((name = f.readLine()) != null) {
				uName = getUserName(name);
				pName = getProductName(name);
				if(uName.compareTo(thePerson.userName) == 0) {

					SProduct = findProductByProductName(pName);
					if(SProduct != null) {
						thePerson.AddProduct(SProduct);
					}
				}
			}

			System.err.println(thePerson.toString());
		}catch (Exception e) {
			System.err.println(e);
		}
	}

	private String getUserName(String name) {

		int div = name.lastIndexOf(':');
		return name.substring(0,div);
	}


	private Product findProductByProductName(String pName) {

		ProductIterator iter = new ProductIterator(productList);
		return iter.findByName(pName);
	}


	private String getProductName( String name) {
		int div = name.lastIndexOf(':');
		return name.substring(div + 1,name.length());
	}

	public boolean SelectProduct() {
		ProductDialogSys ele = new ProductDialogSys();
		SProduct = ele.ShowDlg(thePerson.productList);
		thePerson.currentProduct = SProduct;
		//nProductCategory = ele.nProductCategory;
		//return ele.isLogout();
		return false;
	}

	/**
	 *
	 */
	public boolean productOperation() {
		thePerson.createProductMenu(SProduct, nProductCategory);
		return thePerson.showMenu();
	}

}
