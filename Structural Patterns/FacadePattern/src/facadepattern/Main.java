/*
Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system. 
This type of design pattern comes under structural pattern as this pattern adds an interface to existing system to hide its complexities.

This pattern involves a single class which provides simplified methods required by client and delegates calls to methods of existing system classes.


Cephe deseni sistemin karmaşıklıklarını gizler ve istemciye sisteme erişebilecekleri bir arabirim sağlar.
Bu tasarım modeli, modelin karmaşıklığını gizlemek için mevcut sisteme bir arayüz eklediğinden, yapısal modelin altında gelir.

Bu kalıp, istemci tarafından istenen basitleştirilmiş yöntemler ve varolan sistem sınıfları yöntemlerine yapılan çağrıları veren tek bir sınıfı içerir.
 */
package facadepattern;

/**
 *
 * @author cihan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}
