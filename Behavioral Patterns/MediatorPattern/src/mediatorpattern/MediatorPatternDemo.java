/*
Mediator pattern is used to reduce communication complexity between multiple objects or classes. 
This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling. 
Mediator pattern falls under behavioral pattern category.

Implementation
We are demonstrating mediator pattern by example of a chat room where multiple users can send message to chat room and it is the responsibility of chat room to show the messages to all users. 
We have created two classes ChatRoom and User. 
User objects will use ChatRoom method to share their messages.

MediatorPatternDemo, our demo class, will use User objects to show communication between them.


Arabulucu modeli, birden çok nesne veya sınıf arasındaki iletişim karmaşıklığını azaltmak için kullanılır.
Bu model, normal olarak farklı sınıflar arasındaki tüm iletişimleri işleyen ve kodun gevşek bağlantıyla kolay bakımını destekleyen bir aracı sınıfı sağlar.
Arabulucu paterni davranış paterni kategorisine girer.

Uygulama
Çok sayıda kullanıcının sohbet odasına mesaj gönderebileceği bir sohbet odası örneğinde aracı modelini gösteriyoruz ve mesajları tüm kullanıcılara göstermek için sohbet odasının sorumluluğundayız.
ChatRoom ve User olmak üzere iki sınıf oluşturduk.
Kullanıcı nesneleri, mesajlarını paylaşmak için ChatRoom yöntemini kullanacaktır.

MediatorPatternDemo, demo sınıfımız, aralarındaki iletişimi göstermek için Kullanıcı nesnelerini kullanır.
 */
package mediatorpattern;

import mediatorpattern.user.User;

/**
 *
 * @author cihan
 */
public class MediatorPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        Thread.sleep(2000);
        john.sendMessage("Hello! Robert!");
    }

}
