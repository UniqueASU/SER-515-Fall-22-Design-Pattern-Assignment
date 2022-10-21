package PTBS;

// class for user to use as node, implements visitor design pattern functionality.
@SuppressWarnings("unused")
abstract public class NodeVisitor {

	/**
	 *  
	 */
	
	public NodeVisitor(){
		
	}
	
	public abstract void visitProduct(Product product);

	public abstract void visitTrading(Trading trading);

	public abstract void visitFacade(Facade facade);
	
	public abstract void visitClassProductList(ClassProductList product);
}
