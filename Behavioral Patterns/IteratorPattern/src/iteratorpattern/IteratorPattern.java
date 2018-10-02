/*
Iterator pattern is very commonly used design pattern in Java and .Net programming environment. 
This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.

Iterator pattern falls under behavioral pattern category.

Implementation
We're going to create a Iterator interface which narrates navigation method and a Container interface which retruns the iterator. 
Concrete classes implementing the Container interface will be responsible to implement Iterator interface and use it

IteratorPatternDemo, our demo class will use NamesRepository, a concrete class implementation to print a Names stored as a collection in NamesRepository.


Yineleyici kalıbı, Java ve .Net programlama ortamında çok sık kullanılan tasarım desenidir. 
Bu örüntü, bir altyazı nesnesini tanımak gerekmeden bir toplama nesnesinin öğelerine sıralı bir şekilde erişmek için kullanılır.

Yineleyici modeli davranışsal desen kategorisine girer.

Uygulama
Gezinme yöntemini ve yineleyiciyi geri çeken bir Kapsayıcı arabirimini anlatan bir yineleyici arabirimi oluşturacağız. 
Konteyner arayüzünü uygulayan somut sınıflar, Iterator arayüzünü uygulamak ve kullanmaktan sorumlu olacaktır.

IteratorPatternDemo, demo sınıfımız, NamesRepository'de bir koleksiyon olarak saklanan bir İsimleri yazdırmak için somut bir sınıf uygulaması olan NamesRepository'yi kullanacaktır.

 */
package iteratorpattern;

import iteratorpattern.interfaces.Iterator;
import iteratorpattern.repository.NameRepository;

/**
 *
 * @author cihan
 */
public class IteratorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }

}
