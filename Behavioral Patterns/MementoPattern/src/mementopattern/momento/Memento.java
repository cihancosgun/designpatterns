/*
Memento pattern is used to restore state of an object to a previous state. 
Memento pattern falls under behavioral pattern category.

Implementation
Memento pattern uses three actor classes. 
Memento contains state of an object to be restored. 
Originator creates and stores states in Memento objects and Caretaker object is responsible to restore object state from Memento. 
We have created classes Memento, Originator and CareTaker.

MementoPatternDemo, our demo class, will use CareTaker and Originator objects to show restoration of object states.



Hatıra kalıbı, bir nesnenin durumunu önceki bir duruma geri yüklemek için kullanılır.
Hatıra deseni davranış paterni kategorisine girer.

uygulama
Hatıra deseninde üç aktör sınıfı kullanılıyor.
Hatıra, geri yüklenecek bir nesnenin durumunu içerir.
Mucit, Hatıra nesnelerindeki durumları oluşturur ve depolar ve Bekçi nesnesi, Hatıra'dan nesne durumunu geri yüklemekle yükümlüdür.
Memento, Originator and CareTaker sınıflarını oluşturduk.

Demo sınıfımız MementoPatternDemo, nesne durumlarının restorasyonunu göstermek için CareTaker ve Originator nesnelerini kullanacak.

 */
package mementopattern.momento;

/**
 *
 * @author cihan
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
