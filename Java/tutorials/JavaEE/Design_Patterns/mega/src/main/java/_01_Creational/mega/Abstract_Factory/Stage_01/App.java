package _01_Creational.mega.Abstract_Factory.Stage_01;

import _01_Creational.mega.Abstract_Factory.Stage_01.cd_slayer.MusicFactoryCdSlayerImpl;
import _01_Creational.mega.Abstract_Factory.Stage_01.vinil_metallica.MusicFactoryVinylMetallicaImpl;

public class App {
    public static void main(String[] args) {

        // Создаем компакт диск Slayer
        MusicFactory mf = new MusicFactoryCdSlayerImpl();
        Media media = mf.createMedia();
        Phonogram phonogram = mf.createPhonogram();

        media.retrieveFromPackaging();
        phonogram.play();

        // Создаем винил Metallica
        MusicFactory mf2 = new MusicFactoryVinylMetallicaImpl();
        Media media2 = mf2.createMedia();
        Phonogram phonogram2 = mf2.createPhonogram();

        media2.retrieveFromPackaging();
        phonogram2.play();

    }
}
