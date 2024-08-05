package com.robie.sobie.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape){
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape){
        if(figures.contains(shape)) {
            figures.remove(shape);
            return true;
        } else {
            return false;
        }
    }

    public Shape getFigure(int figureIndex) {
        if (figureIndex >= 0 && figureIndex < figures.size()) {
            return figures.get(figureIndex);
        } else {
            return null;
        }
    }

    public String showFigures(){
        StringBuilder sb = new StringBuilder();
        for(Shape shape : figures){
            sb.append(shape.toString());
        }
        return sb.toString();
    }
}
