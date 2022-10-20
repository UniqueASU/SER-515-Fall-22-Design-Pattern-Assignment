package ptbs;

abstract public class ProductMenu {
    private Person person;
    public Product tProduct;

    public ProductMenu(){

    }
    public abstract void showMenu(Product product);

    public abstract void showAddButton();

    public abstract void showViewButton();

    public abstract void showRadioButton();

    public abstract void showLabels();

    public abstract void showComboxes();


}
