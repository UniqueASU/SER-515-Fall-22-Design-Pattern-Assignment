package ptbs;

public class Seller extends Person{

    public void showMenu() {
        showAddButton();
        showLabels();
        showViewButton();
        showRadioButton();
    }

    @Override
    public ProductMenu createProductMenu(Product product, int category) {
        if(category==1){
            theProductMenu = new ProduceProductMenu();
        }
        else {
            theProductMenu = new MeatProductMenu();
        }
        return theProductMenu;
    }
    public Seller(){
        type=1; // For seller value is 1
    }
}
