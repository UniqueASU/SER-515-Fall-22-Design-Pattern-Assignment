package PTBS;
import java.io.*;

import java.util.ArrayList;
public class ClassProductList extends ArrayList<Product> {
	// Iterator design pattern
	private static final long serialVersionUID = 1L;
	public ClassProductList() {

	}
	public Product FindProductByProductName(String pName) {
		int pc= size();
		int i=0 ;
		while(i<pc) {
			Product product;
			product = (Product) get(i);
			if(product.name.compareTo(pName) ==0)
				return product;
			i++;
		}
		return null;
	}
	public void ReadFile(String fname) {
		try{
			String pname = null;
			File productDetails = new File("ProductInfo.txt");
			BufferedReader file = new BufferedReader(new FileReader(productDetails));
			while ((pname = file.readLine()) != null) {
				Product product;
				int div = pname.lastIndexOf(':');
				product = new Product(pname.substring(div+1,pname.length()), pname.substring(0,div));
				this.add(product);
			}
			file.close();
		} catch (Exception e)  {

		};
	}

	public void accept(NodeVisitor visitor) {
		visitor.visitClassProductList(this);
	}

}
