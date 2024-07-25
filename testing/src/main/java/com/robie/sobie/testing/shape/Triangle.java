package com.robie.sobie.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private double height;
    private double base;
    private String shapeName;

    Triangle(String shapeName, double base, double height){
        this.shapeName = shapeName;
        this.base = base;
        this.height = height;
    }

    public String getShapeName(){
        return shapeName;
    }

    public double getField(){
        return (base*height)/2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle triangle)) return false;
        return Double.compare(height, triangle.height) == 0 && Double.compare(base, triangle.base) == 0 && Objects.equals(getShapeName(), triangle.getShapeName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, base, getShapeName());
    }

    @Override
    public String toString() {
        return "Triangle name = " + shapeName + ", base = " + base + ", height = " + height;
    }
}