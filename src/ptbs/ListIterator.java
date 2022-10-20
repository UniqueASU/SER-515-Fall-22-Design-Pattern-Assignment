package ptbs;

import java.util.ArrayList;

public abstract class ListIterator<T> {

    ArrayList<T> items;
    int curIndx = 0;

    public ListIterator(ArrayList<T> items) {
        this.items = items;
    }
    public abstract boolean hasNext();
    public abstract T Next();

    public abstract void MoveToHead();

    public abstract void Remove();
}
