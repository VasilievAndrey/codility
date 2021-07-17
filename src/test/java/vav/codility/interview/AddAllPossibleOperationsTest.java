package vav.codility.interview;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AddAllPossibleOperationsTest {

    @Test
    public void test() {
        AddAllPossibleOperations sub = new AddAllPossibleOperations();
        List<String> res = sub.addOperators("123", 6);
        assertEquals(res.size(), 2);

        res = sub.addOperators("232", 8);
        assertEquals(res.size(), 2);

        res = sub.addOperators("105", 5);
        assertEquals(res.size(), 2);

        res = sub.addOperators("105", 5);
        assertEquals(res.size(), 2);

        res = sub.addOperators("00", 0);
        assertEquals(res.size(), 3);

    }

}
