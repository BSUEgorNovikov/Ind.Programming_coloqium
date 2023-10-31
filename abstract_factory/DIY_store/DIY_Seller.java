package DIY_store;

import AbsFactory.Seller;

public class DIY_Seller implements Seller {
    double tax = 0.1;
    @Override
    public double sell(int price) {
        return price + tax * price;
    }
}
