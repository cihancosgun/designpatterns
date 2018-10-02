/*
Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically. 
Observer pattern falls under behavioral pattern category.

Implementation
Observer pattern uses three actor classes. 
Subject, Observer and Client. 
Subject is an object having methods to attach and detach observers to a client object. 
We have created an abstract class Observer and a concrete class Subject that is extending class Observer.

ObserverPatternDemo, our demo class, will use Subject and concrete class object to show observer pattern in action.


Gözlemci deseni, bir nesne değiştirildiğinde nesneler arasında bire çok ilişki varsa, bağımlı nesnelere otomatik olarak değişikliğin bildirilmesi gerektiğinde kullanılır.
Gözlemci deseni davranış paterni kategorisine girer.

Uygulama
Gözlemci deseni üç aktör sınıfı kullanır.
Konu, Gözlemci ve Müşteri.
Konu, gözlemcileri bir istemci nesnesine bağlama ve ayırma yöntemlerine sahip olan bir nesnedir.
Bir gözlemci sınıfı olan Observer'ı genişleten bir sınıf oluşturduk.

ObserverPatternDemo, demo sınıfımız, gözlemci modelini eylem halinde göstermek için Konu ve beton sınıfı nesnesini kullanacaktır.
 */
package observerpattern;

import java.util.Scanner;
import observerpattern.observer.BinaryObserver;
import observerpattern.observer.HexaObserver;
import observerpattern.observer.OctalObserver;
import observerpattern.subject.Subject;

/**
 *
 * @author cihan
 */
public class ObserverPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);

        Scanner in = new Scanner(System.in);
        System.out.println("for exit write 0");
        boolean run = true;
        while (run) {
            int s = in.nextInt();
            System.out.format("state change: %d\r\n", s);
            subject.setState(s);
            run = s != 0;
        }

    }

}
