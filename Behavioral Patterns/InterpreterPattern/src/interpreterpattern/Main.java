/*
Interpreter pattern provides a way to evaluate language grammar or expression. 
This type of pattern comes under behavioral pattern. 
This pattern involves implementing an expression interface which tells to interpret a particular context. 
This pattern is used in SQL parsing, symbol processing engine etc.

Implementation
We are going to create an interface Expression and concrete classes implementing the Expression interface. 
A class TerminalExpression is defined which acts as a main interpreter of context in question. Other classes OrExpression, AndExpression are used to create combinational expressions.

InterpreterPatternDemo, our demo class, will use Expression class to create rules and demonstrate parsing of expressions.

Tercüman modeli dil dilbilgisi veya ifadesini değerlendirmenin bir yolunu sunar.
Bu tarz bir model davranışsal örüntü altında gelir.
Bu kalıp, belirli bir bağlamı yorumlamayı söyleyen bir ifade arayüzünün uygulanmasını içerir.
Bu desen, SQL ayrıştırma, sembol işleme motoru vb. işlerde kullanılabilir.

Uygulama
İfade arayüzünü uygulayan bir arabirim İfadesi ve somut sınıflar oluşturacağız.
Söz konusu bağlamın ana yorumlayıcısı olarak hareket eden bir sınıf TerminalExpression tanımlanmıştır. 
Diğer sınıflar OrExpression, AndExpression, birleşik ifadeler oluşturmak için kullanılır.

InterpreterPatternDemo, demo sınıfımız, kurallar oluşturmak ve ifadelerin ayrıştırılmasını göstermek için Expression sınıfını kullanacaktır.
 */
package interpreterpattern;

import interpreterpattern.expressions.AndExpression;
import interpreterpattern.expressions.OrExpression;
import interpreterpattern.expressions.TerminalExpression;
import interpreterpattern.interfaces.Expression;

/**
 *
 * @author cihan
 */
public class Main {

    //Rule: Robert and John are male
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }

}
