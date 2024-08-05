package com.robie.sobie.testing.shape;
public class sproba {


    public static void main(String[] args) {
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle1 = new Circle("circle1",3.3);
        System.out.println(shapeCollector.figures.size());
        shapeCollector.addFigure(circle1);
        System.out.println(shapeCollector.figures.size());
        boolean isRemoved = shapeCollector.removeFigure(circle1);
        System.out.println(shapeCollector.figures.size());
    }
}
