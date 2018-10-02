/*
As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request. 
This pattern decouples sender and receiver of a request based on type of request. This pattern comes under behavioral patterns.
In this pattern, normally each receiver contains reference to another receiver. If one object cannot handle the request then it passes the same to the next receiver and so on.

Implementation
We have created an abstract class AbstractLogger with a level of logging. 
Then we have created three types of loggers extending the AbstractLogger. 
Each logger checks the level of message to its level and print accordingly otherwise does not print and pass the message to its next logger.



Adından da anlaşılacağı gibi, sorumluluk deseni zinciri bir istek için alıcı nesneler zinciri oluşturur.
Bu desen, istek türüne bağlı olarak bir isteğin göndericisini ve alıcısını ayırır. Bu model davranış kalıpları altında gelir.
Bu modelde, normal olarak her alıcı başka bir alıcıya referans içerir. Bir nesne talebi karşılayamazsa, aynı şeyi bir sonraki alıcıya iletir bu böyle devam eder.

Uygulama
Bir günlük AbstractLogger soyut sınıfı oluşturduk.
Daha sonra, AbstractLogger'ı genişleten üç tip logger oluşturduk.
Her logger mesaj seviyesini seviyesine göre kontrol eder ve buna göre yazdırır, aksi halde mesajı bir sonraki kaydediciye yazdırmaz ve iletmez.
 */
package chainofresponsibilitypattern;

import chainofresponsibilitypattern.abstarcts.AbstractLogger;
import chainofresponsibilitypattern.loggers.ConsoleLogger;
import chainofresponsibilitypattern.loggers.ErrorLogger;
import chainofresponsibilitypattern.loggers.FileLogger;

/**
 *
 * @author cihan
 */
public class Main {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
