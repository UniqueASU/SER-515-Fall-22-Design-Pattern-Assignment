package PTBS;

import java.util.Date;

//implements Visitor design pattern and controls offering functionalities..
@SuppressWarnings("unused")
public class Offering {
	String Customer ="";	
	String item = "";
	
	int price;
	public boolean set = false;
	public Date sD = new Date();
	
	
	public Offering() {
		
	}
	
	public String stext() {
		String detail;
		detail= Customer+ ":" + item;
		return detail;
	}
	
	public void setPrice(int nprice) {
		price = nprice;
	}
}
