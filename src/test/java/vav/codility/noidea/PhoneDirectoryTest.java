package vav.codility.noidea;

import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneDirectoryTest {

    @Test
    public void test() {
        PhoneDirectory dir = new PhoneDirectory(3);
        assertTrue(dir.check(2));
        assertEquals(0, dir.get());
        assertEquals(1, dir.get());
        dir.release(2);
        assertFalse(dir.check(1) );
        assertEquals(2, dir.get());
        assertEquals(-1, dir.get());
    }

}
