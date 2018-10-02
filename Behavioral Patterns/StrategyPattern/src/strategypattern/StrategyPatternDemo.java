/*
In Strategy pattern, a class behavior or its algorithm can be changed at run time. 
This type of design pattern comes under behavior pattern.

In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. 
The strategy object changes the executing algorithm of the context object.

Implementation
We are going to create a Strategy interface defining an action and concrete strategy classes implementing the Strategy interface. 
Context is a class which uses a Strategy.

StrategyPatternDemo, our demo class, will use Context and strategy objects to demonstrate change in Context behaviour based on strategy it deploys or uses.


Strateji düzeninde, bir sınıf davranışı veya algoritması çalışma zamanında değiştirilebilir.
Bu tasarım deseni türü davranış kalıbı altındadır.

Strateji modelinde, çeşitli stratejileri temsil eden nesneler ve davranışları strateji nesnesine göre değişen bir bağlam nesnesi oluştururuz.
Strateji nesnesi, bağlam nesnesinin yürütme algoritmasını değiştirir.

uygulama
Strateji arayüzünü uygulayan bir eylem ve somut strateji sınıflarını tanımlayan bir Strateji arayüzü oluşturacağız.
Bağlam, bir Strateji kullanan bir sınıftır.

Demo sınıfımız olan StrategyPatternDemo, İçerik davranışındaki değişimi, kullandığı veya kullandığı stratejiye dayalı olarak göstermek için Bağlam ve strateji nesnelerini kullanır.
 */
package strategypattern;

import strategypattern.operations.OperationAdd;
import strategypattern.operations.OperationMultiply;
import strategypattern.operations.OperationSubstract;

/**
 *
 * @author cihan
 */
public class StrategyPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }

}
