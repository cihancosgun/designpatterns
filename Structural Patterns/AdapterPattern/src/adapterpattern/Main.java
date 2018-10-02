/*
Adapter pattern works as a bridge between two incompatible interfaces. 
This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.

This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces. 
A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. 
You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.

We are demonstrating use of Adapter pattern via following example in which an audio player device can play mp3 files only and wants to use an advanced audio player 
capable of playing vlc and mp4 files.



Bağdaştırıcı modeli, uyumsuz iki arabirim arasında köprü görevi görür.
Bu desen modeli, iki bağımsız ara yüzün kapasitesini birleştirdiği için yapısal kalıp altında gelir.

Bu model, bağımsız veya uyumsuz arabirimlerin işlevlerini birleştirmekten sorumlu olan tek bir sınıfı içerir.
Gerçek bir yaşam örneği için, hafıza kartı ve bir dizüstü bilgisayar arasında bir adaptör görevi gören bir kart okuyucu örneği olabilir.
Hafıza kartını, kart okuyucusuna ve kart okuyucusunu dizüstü bilgisayara takarsınız, böylece hafıza kartı dizüstü bilgisayar üzerinden okunabilir.

Bağdaştırıcı modelinin, bir ses çalar aygıtının yalnızca mp3 dosyalarını yürütebileceği ve gelişmiş bir ses oynatıcısı kullanmak istediği aşağıdaki örnek aracılığıyla 
kullanıldığını gösteriyoruz. vlc ve mp4 dosyalarını çalabilir.


 */
package adapterpattern;

import adapterpattern.player.AudioPlayer;

/**
 *
 * @author cihan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
