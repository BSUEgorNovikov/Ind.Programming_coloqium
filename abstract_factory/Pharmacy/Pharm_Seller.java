package Pharmacy;

import AbsFactory.Seller;

public class Pharm_Seller implements Seller {
    double tax = 0.2;
    @Override
    public double sell(int price) {
        return price + tax * price;
    }
}
