package chapter6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    void testThatGivenYearIsALeapYear() {
        int year = 2003;
        assertFalse(LeapYear.isLeapYear(year));
    }

    @Test
    public void testThat2000IsALeapYear(){
        int year = 2000;
        assertTrue(LeapYear.isLeapYear(year));
    }

    @Test
    public void testThat1996IsALeapYear(){
        int year = 1996;
        assertTrue(LeapYear.isLeapYear(year));
    }

    @Test
    public void testThat2004IsALeapYear(){
        int year = 2004;
        assertTrue(LeapYear.isLeapYear(year));
    }

    @Test
    public void testThat1900IsNotALeapYear(){
        int year = 1900;
        assertFalse(LeapYear.isLeapYear(year));
    }

    @Test
    public void testThat1991IsNotALeapYear(){
        int year = 1991;
        assertFalse(LeapYear.isLeapYear(year));
    }

    @Test
    public void testThat2001IsNotALeapYear(){
        int year = 2001;
        assertFalse(LeapYear.isLeapYear(year));
    }

    @Test
    public void testThat2002IsNotALeapYear(){
        int year = 2002;
        assertFalse(LeapYear.isLeapYear(year));
    }

    @Test
    public void testThat2005IsNotALeapYear(){
        int year = 2005;
        assertFalse(LeapYear.isLeapYear(year));
    }

    @Test
    public void testThatNoNegativeYear(){
        int year = -2003;
        assertFalse(LeapYear.isLeapYear(year));
    }
}