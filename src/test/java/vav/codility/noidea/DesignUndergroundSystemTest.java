package vav.codility.noidea;

import org.junit.Test;

import static org.junit.Assert.*;

public class DesignUndergroundSystemTest {

    private static final double DELTA = 1e-15;
    @Test
    public void test() {
        DesignUndergroundSystem test = new DesignUndergroundSystem();
        test.checkIn(45, "Leyton", 3);
        test.checkIn(32, "Paradise", 8);
        test.checkIn(27, "Leyton", 10);
        test.checkOut(45, "Waterloo", 15);
        test.checkOut(27, "Waterloo", 20);
        test.checkOut(32, "Cambridge", 22);
        assertEquals(14.0, test.getAverageTime("Paradise", "Cambridge"),DELTA);       // return 14.00000. There was only one travel from "Paradise" (at time 8) to "Cambridge" (at time 22)
        assertEquals(11.0, test.getAverageTime("Leyton", "Waterloo"), DELTA);          // return 11.00000. There were two travels from "Leyton" to "Waterloo", a customer with id=45 from time=3 to time=15 and a customer with id=27 from time=10 to time=20. So the average time is ( (15-3) + (20-10) ) / 2 = 11.00000
        test.checkIn(10, "Leyton", 24);
        assertEquals(11.0, test.getAverageTime("Leyton", "Waterloo"), DELTA);          // return 11.00000
        test.checkOut(10, "Waterloo", 38);
        assertEquals(12.0, test.getAverageTime("Leyton", "Waterloo"), DELTA);          // return 12.00000    }
    }

    @Test
    public void test2() {
        DesignUndergroundSystem test = new DesignUndergroundSystem();
        test.checkIn(45, "Leyton", 3);
        test.checkIn(32,"Paradise",8);
        test.checkIn(27,"Leyton",10);
        test.checkOut(45,"Waterloo",15);
        test.checkOut(27,"Waterloo",20);
        test.checkOut(32,"Cambridge",22);
        assertEquals(14.0,test.getAverageTime("Paradise","Cambridge"), DELTA);
        assertEquals(11,test.getAverageTime("Leyton","Waterloo"), DELTA);
        test.checkIn(10,"Leyton",24);
        assertEquals(11,test.getAverageTime("Leyton","Waterloo"), DELTA);
        test.checkIn(10,"Waterloo",38);
        assertEquals(12.0, test.getAverageTime("Leyton", "Waterloo"), DELTA);          // return 12.00000    }
    }
}
