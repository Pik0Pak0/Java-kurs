package com.robie.sobie.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private double base;
    private String shapeName;

    Square(String shapeName, double base){
        this.shapeName = shapeName;
        this.base = base;
    }

    public String getShapeName(){
        return shapeName;
    }

    public double getField(){
        return base*base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square square)) return false;
        return Double.compare(base, square.base) == 0 && Objects.equals(getShapeName(), square.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, getShapeName());
    }

    @Override
    public String toString() {
        return "Square name = " + shapeName + ", base = " + base;
    }
}