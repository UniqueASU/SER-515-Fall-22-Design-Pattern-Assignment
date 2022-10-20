package ptbs;

// Visitor pattern implementation
abstract public class NodeVisitor {

    public NodeVisitor(){

    }

    public abstract void visitFacade(Facade facade);

    public abstract void visitTrading(Trading trade);

    public abstract void visitProduct(Product product);



}
