/*
In proxy pattern, a class represents functionality of another class. 
This type of design pattern comes under structural pattern.

In proxy pattern, we create object having original object to interface its functionality to outer world.



Proxy modelinde, bir sınıf başka bir sınıfın işlevselliğini temsil eder.
Bu tasarım deseni, yapısal kalıp altında gelir.

Proxy modelinde, işlevselliğini dış dünyaya bağlamak için orijinal nesneye sahip nesne yaratırız.
 */
package proxypattern;

import proxypattern.images.ProxyImage;
import proxypattern.interfaces.Image;

/**
 *
 * @author cihan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }

}
