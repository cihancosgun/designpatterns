/*
In Null Object pattern, a null object replaces check of NULL object instance. 
Instead of putting if check for a null value, Null Object reflects a do nothing relationship. 
Such Null object can also be used to provide default behaviour in case data is not available.

In Null Object pattern, we create an abstract class specifying various operations to be done, concrete classes extending this class and a null object class providing do nothing implemention of this class and will be used seemlessly where we need to check null value.

Implementation
We are going to create a AbstractCustomer abstract class defining opearations. 
Here the name of the customer and concrete classes extending the AbstractCustomer class. 
A factory class CustomerFactory is created to return either RealCustomer or NullCustomer objects based on the name of customer passed to it.

NullPatternDemo, our demo class, will use CustomerFactory to demonstrate the use of Null Object pattern.



Boş Nesne deseninde, boş nesne NULL nesne örneğinin denetiminin yerini alır.
Boş bir değer olup olmadığını belirtmek yerine, Boş Nesne bir şey yapma ilişkisini yansıtır.
Böyle Boş Nesne, verilerin mevcut olmaması durumunda varsayılan davranışı sağlamak için de kullanılabilir.

Boş Nesne modelinde, yapılacak çeşitli işlemleri, bu sınıfı genişleten somut sınıfları ve bu sınıfın hiçbir uygulamasına yer vermeyen boş bir nesne sınıfını belirten soyut bir sınıf oluşturuyoruz ve boş değeri kontrol etmemiz gereken yerlere yer vereceğiz.

Uygulama
Biz, bir soyut müşteri sınıfını tanımlayan bir soyut sınıf oluşturacağız.
İşte müşterinin adı ve AbstractCustomer sınıfını genişleten somut sınıflar.
Bir müşteri sınıfı CustomerFactory, kendisine gönderilen müşterinin adını temel alan RealCustomer veya NullCustomer nesnelerini döndürmek üzere oluşturulur.

Demo sınıfımız olan NullPatternDemo, Boş Nesne şablonunun kullanımını göstermek için CustomerFactory'yi kullanacak.
 */
package nullobjectpattern;

import nullobjectpattern.abstracts.AbstractCustomer;
import nullobjectpattern.factories.CustomerFactory;

/**
 *
 * @author cihan
 */
public class NullObjectPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
        AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

        System.out.println("Customers");
        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
        System.out.println(customer4.getName());
    }

}
