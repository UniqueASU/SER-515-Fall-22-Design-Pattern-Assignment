package PTBS;
import java.util.*;
import java.text.DateFormat;
// Visitor Pattern Implementation
public class Trading {
	
	public String tradeName;
	public String tradedetails;
	public int trademin;
	
	protected Date dD = new Date();
	
	protected OfferingList offList = new OfferingList();
	protected Offering alternateoff = new Offering();
	
	public Trading() {
	
	}
	
	public void Settrademin(int min ) {
		this.trademin = min;
	}
	public void SetDueDate( Date tdD) {
		this.dD = tdD;
	}
	
	public void setTradeName(String name) {
		this.tradeName = name;
	}
	
	public String tradeDetail(String detail){
		return tradedetails;
		
	}
	
	public boolean isdateDue() {
		Date today = new Date();
		if(today.after(this.dD)) {
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public Offering addOffering(){
		Offering nwOffer = new Offering();
		return nwOffer;
	}
	
	public void AddOffering(Offering nwOffer){
		offList.add(nwOffer);
		
	}
	
	public OfferingIterator GetOfferingIterator() {
		
		OfferingIterator offeriterator = new OfferingIterator(offList);
		return offeriterator;
	}
	
	public String showduedate(){
		DateFormat dF = DateFormat.getDateInstance(DateFormat.SHORT);
		return dF.format(dD);
	}
	
	
	public void accept(NodeVisitor visitor) {
			visitor.visitTrading(this);
	}
	
}
