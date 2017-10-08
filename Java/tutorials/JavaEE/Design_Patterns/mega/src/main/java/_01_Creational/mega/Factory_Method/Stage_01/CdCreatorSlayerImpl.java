package _01_Creational.mega.Factory_Method.Stage_01;

public class CdCreatorSlayerImpl implements CdCreator {
    @Override
    public Cd createCd() {
        return new CdSlayerImpl();
    }
}
