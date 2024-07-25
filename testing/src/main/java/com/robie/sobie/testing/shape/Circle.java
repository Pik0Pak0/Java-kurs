package com.robie.sobie.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    private double radius;
    final double stablePI = Math.PI;
    private String shapeName;

    Circle(String shapeName, double radius){
        this.shapeName = shapeName;
        this.radius = radius;
    }

    public String getShapeName(){
        return shapeName;
    }

    public double getField(){
        return 3.14*(radius*radius);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;
        return Double.compare(radius, circle.radius) == 0 && Objects.equals(getShapeName(), circle.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, getShapeName());
    }

    @Override
    public String toString() {
        return "Circle name = " + shapeName + ", radius = " + radius;
    }
}