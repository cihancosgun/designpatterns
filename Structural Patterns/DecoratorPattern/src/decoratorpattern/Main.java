/*
Decorator pattern allows a user to add new functionality to an existing object without altering its structure. 
This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.
We are demonstrating the use of decorator pattern via following example in which we will decorate a shape with some color without alter shape class.

Dekoratör kalıbı, kullanıcının yapısını değiştirmeden mevcut bir nesneye yeni işlevler eklemesine olanak tanır.
Bu desen modeli, varolan sınıfa bir sarıcı olarak davrandığından, yapısal kalıp altında gelir.

Bu model, orijinal sınıfı saran ve sınıf yöntemleri imzasını bozulmadan saklayan ek işlevler sağlayan bir dekoratör sınıfı oluşturur.
Aşağıdaki örnek üzerinden dekoratör kalıbının kullanımını gösteriyoruz; bu şekilde şekil sınıfını değiştirmeden bir renkle bir şekil süsleyeceğiz.
 */
package decoratorpattern;

import decoratorpattern.interfaces.Shape;
import decoratorpattern.shapes.Circle;
import decoratorpattern.shapes.Rectangle;

/**
 *
 * @author cihan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}
