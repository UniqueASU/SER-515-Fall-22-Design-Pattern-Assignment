package PTBS;

//implements Reminder functionality and uses the Visitor Design Pattern

@SuppressWarnings("unused")
public class ReminderVisitor extends NodeVisitor {

	@SuppressWarnings("unused")
	private Reminder m_Reminder;

// each function should implement the Visitor Capacity.
	public void visitProduct(Product product) {
		ProductIterator trades = (ProductIterator) product.tradeList.listIterator();
//		while (trades.hasNext()) {
//
//			Trading strade = (Trading) trades.Next();
//			strade.accept(this);
//		}
	}

	/**
	 *  
	 */
	public void visitTrading(Trading trading) {

	}

	public void visitFacade(Facade facade) {
//		ProductIterator products =new ProductIterator(facade.productList);
	}

	public void visitClassProductList(ClassProductList cproduct) {

	}

}
