package tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BikesTest {
    private final Bikes bike = new Bikes();

    @Test
    public void testThatBikeExists() {
        assertNotNull(bike);
    }

    @Test
    public void testThatBikeCanBeTurnOn() {
        assertFalse(bike.getIsOn());
        bike.toggleOn();
        assertTrue(bike.getIsOn());
    }

    @Test
    public void testThatBikeCanBeTurnOff() {
        bike.toggleOn();
        assertTrue(bike.getIsOn());
        bike.toggleOn();
        assertFalse(bike.getIsOn());
    }

    @Test
    public void testThatBikeCanBeOnDrive() {
        bike.toggleOn();
        assertFalse(bike.getDrive());
        bike.toggleDrive();
        assertTrue(bike.getDrive());
    }

    @Test
    public void testThatGearIsOneWhenDriveIsTrue() {
        bike.toggleOn();
        assertTrue(bike.getIsOn());
        bike.toggleDrive();
        assertTrue(bike.getDrive());
        assertEquals(0, bike.getGear());

    }

    @Test
    public void testThatBikeSpeedIncreasesByOneWenAcceleratedOnceAndWhenGearIsOne() {
        bike.toggleOn();
        bike.toggleDrive();
        bike.accelerate();
        int bikeSpeed = bike.getSpeed();
        assertEquals(1, bikeSpeed);
    }

    @Test
    public void testThatBikeSpeedIncreasesByOneWhenAcceleratedAndWhenGearIsOne() {
        assertEquals(0, bike.getGear());
        bike.toggleOn();
        bike.toggleDrive();
        for (int index = 1; index <= 20; index++) {
            bike.accelerate();
        }
        int bikeSpeed = bike.getSpeed();
        assertEquals(1, bike.getGear());
        assertEquals(20, bikeSpeed);
    }

    @Test
    public void testThatBikeSpeedIncreasesByTwoWhenAcceleratedAndWhenGearIsTwo() {
        bike.toggleOn();
        bike.toggleDrive();
        for (int index = 0; index <= 20; index++) {
            bike.accelerate();
        }
        bike.accelerate();
        int bikeSpeed = bike.getSpeed();
        assertEquals(23, bikeSpeed);
        assertEquals(2, bike.getGear());
    }


    @Test
    public void testThatBikeSpeedIncreasesByThreeWhenAcceleratedAndWhenGearIsThree() {
        bike.toggleOn();
        bike.toggleDrive();
        for (int i = 1; i <= 27; i++) {
            bike.accelerate();
        }
        int bikeSpeed = bike.getSpeed();
        assertEquals(34, bikeSpeed);
        assertEquals(3, bike.getGear());

    }

    @Test
    public void testThatBikeSpeedIncreasesByFourWhenAcceleratedAndWhenGearIsFour() {
        bike.toggleOn();
        bike.toggleDrive();
        for (int i = 0; i < 40; i++) {
            bike.accelerate();
        }
        bike.accelerate();
        int bikeSpeed = bike.getSpeed();
        assertEquals(87, bikeSpeed);
        assertEquals(4, bike.getGear());
    }

    @Test
    public void testThatBikeSpeedDecreasesByOneWhenDeceleratedAndWhenGearIsOne() {
        bike.toggleOn();
        bike.toggleDrive();
        for (int i = 1; i <=  20; i++) {
            bike.decelerate();
        }
        int bikeSpeed = bike.getSpeed();
        assertEquals(1, bike.getGear());
        assertEquals(0, bikeSpeed);
    }
    @Test
    void testThatBikeSpeedDecreasesByTwoWhenDeceleratedAndWhenGearIsTwo(){
        bike.toggleOn();
        bike.toggleDrive();
        for (int index = 20; index <= 30; index+= 2) {
            bike.decelerate();
            System.out.println(index);
        }
        bike.accelerate();
        int bikeSpeed = bike.getSpeed();
        assertEquals(30, bikeSpeed);
        assertEquals(2, bike.getGear());
    }

    @Test
    void testThatBikeSpeedDecreasesByThreeWhenDeceleratedAndWhenGearIsThree(){
        bike.toggleOn();
        bike.toggleDrive();
        for (int i = 0; i <= 40 ; i++) {
            bike.decelerate();
            System.out.println(i);
        }
        bike.accelerate();
        int bikeSpeed = bike.getSpeed();
        assertEquals(1, bikeSpeed);
        assertEquals(3, bike.getGear());
    }
    @Test
    void testThatBikeSpeedDecreasesByFourWhenDeceleratedAndWhenGearIsFour(){
        bike.toggleOn();
        bike.toggleDrive();
        for (int i = 47; i >= 4 ; i--) {
            bike.decelerate();
        }
        bike.accelerate();
        int bikeSpeed = bike.getSpeed();
        assertEquals(47, bikeSpeed);
        assertEquals(4, bike.getGear());
    }

    @Test
    public void testThatBikeHasAMake(){
        String make = "Mercedes Benz";
        bike.getMake(make);
        assertEquals("Mercedes Benz", make);
    }

    @Test
    public void testThatBikeHasColor(){
        bike.setColor("Black");
        assertEquals("Black", bike.getColor());
    }
    }
