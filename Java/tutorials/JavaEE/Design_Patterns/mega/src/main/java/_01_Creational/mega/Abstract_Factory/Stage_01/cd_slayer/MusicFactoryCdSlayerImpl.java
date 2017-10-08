package _01_Creational.mega.Abstract_Factory.Stage_01.cd_slayer;

import _01_Creational.mega.Abstract_Factory.Stage_01.*;

public class MusicFactoryCdSlayerImpl implements MusicFactory {

    @Override
    public Media createMedia() {
        return new MediaCdImpl();
    }

    @Override
    public Phonogram createPhonogram() {
        return new PhonogramSlayerImpl();
    }
}
