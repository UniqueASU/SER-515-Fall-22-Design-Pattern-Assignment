package ptbs;

public class Buyer extends Person{
    public void showMenu() {
        showAddButton();
        showLabels();
        showViewButton();
        showRadioButton();
    }
    @Override
    public ProductMenu createProductMenu(Product product, int category) {
        if(category==0){
            theProductMenu = new ProduceProductMenu();
        }
        else {
            theProductMenu = new MeatProductMenu();
        }
        return theProductMenu;
    }
    public Buyer(){
        type=0;
    }
}
