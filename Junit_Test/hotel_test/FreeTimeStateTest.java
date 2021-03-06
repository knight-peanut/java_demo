/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 26 00:52:20 GMT 2019
 */

package net.mooctest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FreeTimeStateTest {
    PrintStream console = null;

    ByteArrayOutputStream out = null;

    @Before
    public void setUp() {
        out = new ByteArrayOutputStream();
        console = System.out;
        System.setOut(new PrintStream(out));
    }

    @After
    public void tearDown() throws IOException {
        out.close();
        System.setOut(console);
    }

    @Test(timeout = 4000)
    public void test0() throws Throwable {
        FreeTimeState freeTimeState0 = new FreeTimeState();
        Room room0 = new Room();
        freeTimeState0.book(room0);
        assertEquals("RoomState: Free", freeTimeState0.toString());
        String result = out.toString();
        assertEquals("Operation: Book Room\n" +
                "Room: 0\n" +
                "Result: Success\n", result);
        assertEquals("RoomCode: 0\n" +
                "RoomType: null\n" +
                "Capacity: 0\n" +
                "RoomState: Booked\n" +
                "Price: 0.0\n",room0.toString());
    }

    @Test(timeout = 4000)
    public void test1() throws Throwable {
        FreeTimeState freeTimeState0 = new FreeTimeState();
        Room room0 = new Room();
        // Undeclared exception!
        try {
            freeTimeState0.unsubscribe(room0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // Cannot unsubscribe under current state, RoomState: Free
            //
//         verifyException("net.mooctest.FreeTimeState", e);
        }
    }

    @Test(timeout = 4000)
    public void test2() throws Throwable {
        FreeTimeState freeTimeState0 = new FreeTimeState();
        Room room0 = new Room();
        // Undeclared exception!
        try {
            freeTimeState0.checkOut(room0);
            fail("Expecting exception: IllegalStateException");

        } catch (IllegalStateException e) {
            //
            // Cannot check out under current state, RoomState: Free
            //
//         verifyException("net.mooctest.FreeTimeState", e);
        }
    }

    @Test(timeout = 4000)
    public void test3() throws Throwable {
        FreeTimeState freeTimeState0 = new FreeTimeState();
        Room room0 = new Room();
        freeTimeState0.checkIn(room0);
        assertEquals(0.0, room0.getPrice(), 0.01);
        String result = out.toString();
        assertEquals("Operation: Check In\n" +
                "Room: 0\n" +
                "Result: Success\n", result);
    }
}
