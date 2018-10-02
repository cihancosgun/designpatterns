/*
Singleton pattern is one of the simplest design patterns in Java. 
This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. 
This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.


Tekil desen, Java'daki en basit tasarım desenlerinden biridir. 
Bu desen modeli, kalıp bir nesne oluşturmanın en iyi yollarından birini sağladığı için, yaratılış deseninin altında gelir.

Bu model, tek bir nesnenin oluşturulduğundan emin olarak bir nesne oluşturulmasından sorumlu olan tek bir sınıfı içerir. 
Bu sınıf, sınıfın nesnesini gerçekleştirmeye gerek duymadan doğrudan erişilebilen tek nesnesine erişmenin bir yolunu sağlar.
 */
package singletonpattern;

/**
 *
 * @author cihan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }

}
