package Pharmacy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pharm_Tests {

    @Test
    void calcTest1() {
        Pharm_Calculator pharmCalculator = new Pharm_Calculator();
        assertEquals(80.0, pharmCalculator.calc(100));
    }

    @Test
    void calcTest2() {
        Pharm_Calculator pharmCalculator = new Pharm_Calculator();
        assertEquals(160.0, pharmCalculator.calc(200));
    }

    @Test
    void calcTest3() {
        Pharm_Calculator pharmCalculator = new Pharm_Calculator();
        assertEquals(130.4, pharmCalculator.calc(163));
    }

    @Test
    void sellTest1() {
        Pharm_Seller pharmCalculator = new Pharm_Seller();
        assertEquals(2384.4, pharmCalculator.sell(1987));
    }

    @Test
    void sellTest2() {
        Pharm_Seller pharmCalculator = new Pharm_Seller();
        assertEquals(15.6, pharmCalculator.sell(13));
    }

    @Test
    void sellTest3() {
        Pharm_Seller pharmCalculator = new Pharm_Seller();
        assertEquals(73333.2, pharmCalculator.sell(61111));
    }
}