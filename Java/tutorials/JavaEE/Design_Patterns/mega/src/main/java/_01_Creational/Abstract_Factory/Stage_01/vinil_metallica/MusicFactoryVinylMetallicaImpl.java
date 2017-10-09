package _01_Creational.Abstract_Factory.Stage_01.vinil_metallica;

import _01_Creational.Abstract_Factory.Stage_01.*;

public class MusicFactoryVinylMetallicaImpl implements MusicFactory {

    @Override
    public Media createMedia() {
        return new MediaVinylImpl();
    }

    @Override
    public Phonogram createPhonogram() {
        return new PhonogramMetallicaImpl();
    }
}
