package PTBS;
public class Seller extends Person {

	/**
	 *  
	 */
public Seller(){
		
		type = 1;
	}
	public boolean showMenu() {
		showAddButton();
		showLabels();
		showViewButton();
		showRadioButton();
		return exit();
	}

	public ProductMenu createProductMenu(Product product, int nCategory) {
		if (nCategory == 1) {// if produce product
			theProductMenu = new ProduceProductMenu();
		}
		else {
			theProductMenu = new  MeatProductMenu();
		}
		return theProductMenu ;
		
	
	}
	

}
