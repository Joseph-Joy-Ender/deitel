package chapter8;

import static java.lang.Math.PI;

public class Cylinder {
    private double radius = 1;
    private double height = 1;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (this.radius > 0) this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (this.height > 0) this.height = height;
    }

    public double volume() {
        double rad = getRadius() * getRadius();
        return PI * rad * getHeight();
    }
}
