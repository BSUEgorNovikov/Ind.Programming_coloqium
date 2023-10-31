package Pharmacy;

import AbsFactory.Calculator;

public class Pharm_Calculator implements Calculator {
    double lose_percent = 0.2;
    @Override
    public double calc(int amount) {
        return amount - lose_percent * amount;
    }
}
