package ptbs;

// The Person class is involved in the bridge pattern to show the Menu, and
//in factory menu to create proper menu object.
public abstract class Person {
    public int type;

    ProductMenu theProductMenu;

    abstract public ProductMenu createProductMenu(Product product, int category);

    public void showAddButton(){
        theProductMenu.showAddButton();
    }
    public void showViewButton(){
        theProductMenu.showViewButton();
    }
    public void showRadioButton(){
        theProductMenu.showRadioButton();
    }
    public void showLabels(){
        theProductMenu.showLabels();
    }
    public void showMenu(){
        theProductMenu.showMenu();
    }



}
