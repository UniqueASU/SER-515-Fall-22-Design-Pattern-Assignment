package ptbs;

import java.util.ArrayList;

//Iterator Design Pattern
public class OfferingIterator extends ListIterator<Offering>{
    private OfferingList offeringList;
    public OfferingIterator(ArrayList<Offering> items) {
        super(items);
    }

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

}
