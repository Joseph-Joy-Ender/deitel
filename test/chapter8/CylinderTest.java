package chapter8;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        cylinder.setHeight(3.0);
        cylinder.setRadius(2.2);

        System.out.println(cylinder.volume());
    }

}