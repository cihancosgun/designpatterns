/*
In State pattern a class behavior changes based on its state. 
This type of design pattern comes under behavior pattern.
In State pattern, we create objects which represent various states and a context object whose behavior varies as its state object changes.

Implementation
We are going to create a State interface defining an action and concrete state classes implementing the State interface. 
Context is a class which carries a State.
StatePatternDemo, our demo class, will use Context and state objects to demonstrate change in Context behavior based on type of state it is in.



Durum modelinde bir sınıf davranışı durumuna göre değişir.
Bu tasarım deseni türü davranış kalıbı altındadır.
Durum modelinde, çeşitli durumları temsil eden nesneler ve davranışları durum nesnesi değiştikçe değişen bir bağlam nesnesi oluştururuz.

Uygulama
Durum arayüzünü uygulayan bir eylem ve somut durum sınıflarını tanımlayan bir Durum arayüzü oluşturacağız.
Bağlam, bir Durumu taşıyan bir sınıftır.
StatePatternDemo, bizim demo sınıfımız, İçeriğin içinde bulunduğu durumun türüne bağlı olarak Değişken davranışını göstermek için Bağlam ve durum nesnelerini kullanacaktır.
 */
package statepattern;

import statepattern.context.Context;
import statepattern.states.StartState;
import statepattern.states.StopState;

/**
 *
 * @author cihan
 */
public class StatePatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }

}
