/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facadepattern;

import source.shape.Circle;
import source.shape.Rectangle;
import source.shape.Shape;
import source.shape.Square;

/**
 *
 * @author micha
 */
public class ShapeMaker {

    private Shape circle, rectangle, square;

    /**
     * Draws shapes.
     */
    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    /**
     * Draw a circle.
     */
    public void drawCircle() {
        circle.draw();
    }

    /**
     * Draw a square.
     */
    public void drawSquare() {
        square.draw();
    }

    /**
     * Draw a rectangle.
     */
    public void drawRectangle() {
        rectangle.draw();
    }

}
