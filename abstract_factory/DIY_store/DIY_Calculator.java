package DIY_store;

import AbsFactory.Calculator;

public class DIY_Calculator implements Calculator {
    double lose_percent = 0.1;
    @Override
    public double calc(int amount) {
        return amount - lose_percent * amount;
    }
}
