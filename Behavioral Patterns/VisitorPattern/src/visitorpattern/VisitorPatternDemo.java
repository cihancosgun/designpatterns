/*
In Visitor pattern, we use a visitor class which changes the executing algorithm of an element class. 
By this way, execution algorithm of element can vary as and when visitor varies. 
This pattern comes under behavior pattern category. 
As per the pattern, element object has to accept the visitor object so that visitor object handles the operation on the element object.

Implementation
We are going to create a ComputerPart interface defining accept opearation.Keyboard, Mouse, Monitor and Computer are concrete classes implementing ComputerPart interface. 
We will define another interface ComputerPartVisitor which will define a visitor class operations. 
Computer uses concrete visitor to do corresponding action.

VisitorPatternDemo, our demo class, will use Computer and ComputerPartVisitor classes to demonstrate use of visitor pattern.



Ziyaretçi deseninde, bir öğe sınıfının yürütme algoritmasını değiştiren bir ziyaretçi sınıfı kullanıyoruz.
Bu şekilde, elemanın yürütme algoritması, ziyaretçi değiştiğinde değişebilir.
Bu desen davranış kalıbı kategorisi altındadır.
Modele göre, öğe nesnesi ziyaretçi nesnesini kabul etmelidir, böylece ziyaretçi nesnesi, nesneyi nesne üzerinde işlemeyi gerçekleştirir.

Uygulama
ComputerPart arayüzünü kabul ederek, opearation.Keyboard, Mouse, Monitor ve Computer gibi somut sınıfların kabul edildiği bir ComputerPart arayüzü oluşturacağız.
Bir ziyaretçi sınıfı işlemi tanımlayacak olan başka bir arayüz ComputerPartVisitor tanımlayacağız.
Bilgisayar, ilgili eylemi yapmak için somut ziyaretçiyi kullanır.

VisitorPatternDemo, demo sınıfımız, ziyaretçi modelinin kullanımını göstermek için Computer and ComputerPartVisitor sınıflarını kullanacak.

 */
package visitorpattern;

import visitorpattern.computer.Computer;
import visitorpattern.computer.ComputerPartDisplayVisitor;
import visitorpattern.interfaces.ComputerPart;

/**
 *
 * @author cihan
 */
public class VisitorPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }

}
