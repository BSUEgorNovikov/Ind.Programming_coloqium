package DIY_store;

import Pharmacy.Pharm_Calculator;
import Pharmacy.Pharm_Seller;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DIY_Tests {
    @Test
    void calcTest1() {
        DIY_Calculator pharmCalculator = new DIY_Calculator();
        assertEquals(90.0, pharmCalculator.calc(100));
    }

    @Test
    void calcTest2() {
        DIY_Calculator pharmCalculator = new DIY_Calculator();
        assertEquals(180.0, pharmCalculator.calc(200));
    }

    @Test
    void calcTest3() {
        DIY_Calculator pharmCalculator = new DIY_Calculator();
        assertEquals(146.7, pharmCalculator.calc(163));
    }

    @Test
    void sellTest1() {
        DIY_Seller pharmCalculator = new DIY_Seller();
        assertEquals(2185.7, pharmCalculator.sell(1987));
    }

    @Test
    void sellTest2() {
        DIY_Seller pharmCalculator = new DIY_Seller();
        assertEquals(14.3, pharmCalculator.sell(13));
    }

    @Test
    void sellTest3() {
        DIY_Seller pharmCalculator = new DIY_Seller();
        assertEquals(67222.1, pharmCalculator.sell(61111));
    }
}