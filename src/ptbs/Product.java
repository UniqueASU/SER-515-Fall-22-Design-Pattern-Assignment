package PTBS;
import java.util.*;
// Class for defining Product functionalities and implements the factory method pattern.

public class Product {
	public ArrayList<Trading> tradeList = new ArrayList <Trading>();
    public String name;
    public String category;
    public int nP;




    public Product (String nproduct, String category){
    	this.category = category; // type of the product.
    	this.nP=0;
    	this.name= nproduct;

    }

    void accept(NodeVisitor visitor){
    	visitor.visitProduct(this);
    }

    public void AddTrading(Trading trade){
    	tradeList.add(trade);
    }

	@Override
	public String toString() {
		return "Product [name=" + name + ", nCategory=" + category + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}




    //public int productnum() {
    //	return tradeList.size();
    // }
}
