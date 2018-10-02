/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author cihan
 */
public class ShapeFactory {

    public enum ShapeTypeEnum {
        CIRCLE, RECTANGLE, SQUARE
    }

    public Shape getShape(ShapeTypeEnum shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (ShapeTypeEnum.CIRCLE.equals(shapeType)) {
            return new Circle();
        } else if (ShapeTypeEnum.RECTANGLE.equals(shapeType)) {
            return new Rectangle();

        } else if (ShapeTypeEnum.SQUARE.equals(shapeType)) {
            return new Square();
        }
        return null;
    }
}
