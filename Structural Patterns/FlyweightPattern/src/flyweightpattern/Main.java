/*
Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. 
This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.

Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found. 
We will demonstrate this pattern by drawing 20 circles of different locations but we will create only 5 objects. Only 5 colors are available so color property is used to check already existing Circle objects.


Sinek siklet deseni öncelikle oluşturulan nesnelerin sayısını azaltmak ve bellek ayak izini azaltmak ve performansı artırmak için kullanılır.
Bu tasarım modeli, modelin nesne sayısının azaltılması ve böylece uygulamanın nesne yapısının iyileştirilmesi için yollar sağladığından yapısal modelin altında gelir.

Flyweight modeli, zaten mevcut olan benzer nesneleri tekrar depolar ve eşleşen bir nesne bulunmadığında yeni bir nesne oluşturmaya çalışır.
Bu deseni, 20 farklı konumdan çizerek göstereceğiz ama sadece 5 nesne oluşturacağız. Sadece 5 renk mevcuttur, bu yüzden mevcut olan Circle nesnelerini kontrol etmek için renk özelliği kullanılır.
 */
package flyweightpattern;

import flyweightpattern.shapes.Circle;

/**
 *
 * @author cihan
 */
public class Main {

    private static final String colors[] = {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }

}
