package _01_Creational.Factory_Method.Stage_02;

public class CdCreatorSlayerImpl implements CdCreator {
    @Override
    public Cd createCd() {
        return new CdSlayerImpl();
    }
}
