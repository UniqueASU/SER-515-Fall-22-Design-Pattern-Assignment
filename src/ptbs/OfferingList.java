package PTBS;
import java.util.*;

// uses arraylist to manage offering list
public class OfferingList extends ArrayList<Offering> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private OfferingIterator offeringIterator;
	
	public OfferingList(List<Offering> offers) {
		super(offers);
	}

	public OfferingList() {
		super();
	}
	
	
}
