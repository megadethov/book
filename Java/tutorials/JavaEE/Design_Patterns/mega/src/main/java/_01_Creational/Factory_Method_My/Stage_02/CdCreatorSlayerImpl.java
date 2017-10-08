package _01_Creational.Factory_Method_My.Stage_02;

public class CdCreatorSlayerImpl implements CdCreator {
    @Override
    public Cd createCd() {
        return new CdSlayerImpl();
    }
}
