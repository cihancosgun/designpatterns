/*
Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently. 
This type of design pattern comes under structural pattern as this pattern decouples implementation class and abstract class by providing a bridge structure between them.

This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implementer classes. 
Both types of classes can be altered structurally without affecting each other.

We are demonstrating use of Bridge pattern via following example in which a circle can be drawn in different colors using same abstract class method but different bridge implementer classes.


Köprü, uygulanmasından bir soyutlamayı ayırmamız gerektiğinde kullanılır, böylece ikisi bağımsız olarak değişebilir.
Bu desen modeli, modelin, aralarında bir köprü yapısı sağlayarak uygulama sınıfı ve soyut sınıfı ayırdığı için yapısal kalıp altında gelir.

Bu model, arabirim uygulayıcı sınıflarından bağımsız olarak somut sınıfların işlevselliğini sağlayan bir köprü görevi gören bir arabirimi içerir.
Her iki sınıf türü de birbirlerini etkilemeden yapısal olarak değiştirilebilir.

Köprü şablonunun, aşağıdaki özetle aynı soyut sınıf yöntemini kullanarak ancak farklı köprü uygulayıcı sınıflarını kullanarak farklı renklerde 
çizilebildiği aşağıdaki örnek aracılığıyla gösteriyoruz.

 */
package bridgepattern;

import bridgepattern.abstracts.Shape;
import bridgepattern.pens.GreenCircle;
import bridgepattern.pens.RedCircle;
import bridgepattern.shapes.Circle;

/**
 *
 * @author cihan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }

}
