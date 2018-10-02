/*
Factory pattern is one of the most used design patterns in Java. 
This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

Fabrika düzeni, Java'daki en çok kullanılan tasarım modellerinden biridir. 
Bu desen modeli, kalıp bir nesne oluşturmanın en iyi yollarından birini sağladığı için, yaratılış deseninin altında gelir.
Fabrika modelinde, istemciye oluşturma mantığını açığa çıkarmadan nesne oluşturur ve ortak bir arabirim kullanarak yeni oluşturulmuş nesneye başvururuz.
 */
package factorypattern;

/**
 *
 * @author cihan
 */
public class FactoryPattern {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape(ShapeFactory.ShapeTypeEnum.CIRCLE);

        //call draw method of Circle
        shape1.draw();

        //get an object of Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape(ShapeFactory.ShapeTypeEnum.RECTANGLE);

        //call draw method of Rectangle
        shape2.draw();

        //get an object of Square and call its draw method.
        Shape shape3 = shapeFactory.getShape(ShapeFactory.ShapeTypeEnum.SQUARE);

        //call draw method of square
        shape3.draw();
    }

}
