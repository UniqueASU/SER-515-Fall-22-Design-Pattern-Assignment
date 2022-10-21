package PTBS;

import java.util.ArrayList;

//handles iterator for the product, uses Iterator design pattern
public class ProductIterator extends ListIterator<Product> {

	public ProductIterator(ArrayList<Product> items) {
		super(items);
	}

	public boolean hasNext() {
		if (curIndx >= items.size() - 1) {
			return false;
		} else
			return true;
	}

	public Product Next() {
		if (hasNext() == true) {
			curIndx++;
			return items.get(curIndx);
		}
		return null;
	}

	public void MoveToHead() {
		Remove();
		curIndx = 0;
	}

	public void Remove() {
		items.remove(curIndx);
	}

	@Override
	public Product findByName(String name) {
		for (Product product : items) {
			if (product.name.equals(name))
				return product;
		}
		return null;
	}

}
