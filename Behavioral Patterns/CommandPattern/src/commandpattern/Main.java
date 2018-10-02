/*
Command pattern is a data driven design pattern and falls under behavioral pattern category. 
A request is wrapped under an object as command and passed to invoker object. 
Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.

Implementation
We have created an interface Order which is acting as a command. We have created a Stock class which acts as a request. 
We have concrete command classes BuyStock and SellStock implementing Order interface which will do actual command processing. 
A class Broker is created which acts as an invoker object. It can take and place orders.

Broker object uses command pattern to identify which object will execute which command based on the type of command. 
CommandPatternDemo, our demo class, will use Broker class to demonstrate command pattern.


Komut deseni, veri odaklı bir tasarım modelidir ve davranışsal kalıp kategorisine girer.
Bir istek, bir nesne olarak komut olarak sarılır ve invoker nesnesine iletilir.
Invoker nesnesi, bu komutu işleyebilecek uygun nesneyi arar ve komutu, komutu yürüten karşılık gelen nesneye geçirir.

Uygulama
Komut olarak hareket eden bir arayüz emri oluşturduk. Bir istek olarak hareket eden bir Stok sınıfı oluşturduk.
Gerçek buyruk işlemlerini yapacak olan OrderStock ve SellStock uygulama emrini içeren somut komuta sınıflarımız var.
Bir invoker nesne olarak hareket eden bir sınıf Broker yaratılır. Emir alabilir.

Komisyoncu nesnesi, komutun türüne dayalı olarak hangi komutun yürütüleceğini tanımlamak için komut desenini kullanır.
CommandPatternDemo, demo sınıfımız, komut modelini göstermek için Broker sınıfını kullanacak.

 */
package commandpattern;

import commandpattern.broker.Broker;
import commandpattern.stock.BuyStock;
import commandpattern.stock.SellStock;
import commandpattern.stock.Stock;

/**
 *
 * @author cihan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }

}