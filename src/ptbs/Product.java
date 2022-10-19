package ptbs;

import java.util.ArrayList;

public class Product {
    public ArrayList<Trading> tradingList = new ArrayList <Trading>();

    public void AddTrading(Trading trade){
        tradingList.add(trade);
    }
}
