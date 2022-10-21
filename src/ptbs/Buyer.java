package PTBS;


//uses bridge design pattern and is a subclass of Person
public class Buyer extends Person {
	public Buyer(){
		
		type = 0;
	}
	public boolean showMenu() {
		showAddButton();
		showLabels();
		showViewButton();
		showRadioButton();
		return exit();
	}

	public ProductMenu createProductMenu(Product product, int nCategory) {
		if (nCategory == 1) {
			theProductMenu = new ProduceProductMenu();
		}
		else {
			theProductMenu = new  MeatProductMenu();
		}
		return theProductMenu ;
		
	
	}
	
}
