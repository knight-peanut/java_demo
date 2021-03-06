/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 00:49:13 GMT 2019
 */

package net.mooctest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ManagerTest {

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        Manager manager0 = new Manager();
        String string0 = manager0.transferPrice(26);
        assertEquals("XXVI", string0);
        assertNotNull(string0);
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        Manager manager0 = new Manager();
        String string0 = manager0.transferPrice(4206.8);
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        Manager manager0 = new Manager();
        String string0 = manager0.transferPrice((-1906.2665112402956));
        assertNull(string0);
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        Manager manager0 = new Manager();
        // Undeclared exception!
        try {
            manager0.checkIn(26, 26);
            fail("Expecting exception: NullPointerException");

        } catch (NullPointerException e) {
            //
            // Room not exists: 26
            //
//         verifyException("net.mooctest.Manager", e);
        }
    }


    @Test(timeout = 4000)
    public void test4() throws Throwable {
        Manager manager = new Manager();
        Hotel.addRoom("Standard Room", 211, 4);
        Hotel.addRoom("Advanced Room", 212, 3);
        Hotel.addRoom("Deluxe Room", 213, 2);
        Hotel.addRoom("Deluxe Room", 214, 1);
        double room1 = manager.checkIn(3, 211);
        assertEquals(480.0, room1, 0.00001);
        double room2 = manager.checkIn(4, 212);
        assertEquals(756.0, room2, 0.00001);
        double room3 = manager.checkIn(8, 213);
        assertEquals(1536.0, room3, 0.00001);
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test(timeout = 4000)
    public void test5() throws Throwable {
        Hotel.addRoom("Deluxe Room", 215, 1);
        Manager manager = new Manager();
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Days should larger than zero.");
        manager.checkIn(0, 214);
    }
}
