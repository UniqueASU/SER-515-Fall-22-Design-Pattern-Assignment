package PTBS;

import java.util.ArrayList;
// implements Iterator design pattern
public class OfferingIterator extends ListIterator<Offering> {

	public OfferingIterator(ArrayList<Offering> items) {
		super(items);
	}

	private OfferingList offeringList;

	public boolean hasNext() {
		if (curIndx >= offeringList.size() - 1) {
			return false;
		} else
			return true;
	}

	public Offering Next() {
		if (hasNext() == true) {
			curIndx++;
			return items.get(curIndx);
		} else
			return null;
	}

	public void MoveToHead() {
		Remove();
		curIndx = 0;
	}

	public void Remove() {
		offeringList.remove(curIndx);
	}

	@Override
	public Offering findByName(String name) {
		return null;
	}

}
