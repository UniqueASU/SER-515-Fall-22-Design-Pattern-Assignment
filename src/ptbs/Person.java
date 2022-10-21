package PTBS;
import java.util.*;


// This is an abstract class that points to either a seller or a buyer. This implements the factory pattern
public abstract class Person {

	int type ;
	public String userName;
	public ClassProductList productList;
	protected ProductMenu theProductMenu;
	public Product currentProduct;
	public Trading currentTrade;

	Person() {
		productList = new ClassProductList();
	}

	abstract public ProductMenu createProductMenu(Product product,int category );

	public boolean showMenu() {
		Iterator<Trading> theIter = currentProduct.tradeList.iterator();
		theProductMenu.productItem = currentProduct;
		Trading trade;
		while(theIter.hasNext()) {
			trade = (Trading) theIter.next();
			theProductMenu.trax.addItem(trade);
		}
		return false;
	}

	public ClassProductList GetProductList() {
		return productList;
	}

	public void AddProduct(Product product) {
		productList.add(product);
	}
	public void showAddButton(){
		theProductMenu.showAddButton();

	};


	public void showViewButton(){
		theProductMenu.showViewButton();
	};

	public void showRadioButton(){
		theProductMenu.showRadioButton();
	};

	/**
	 *
	 */

	public void showComboxes() {
		theProductMenu.showComboxes();
	}


	public void showLabels() {
		theProductMenu.showLabels();
	};

	public boolean exit() {
		return theProductMenu.ifLogout();
	}
}
