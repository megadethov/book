package _01_Creational.Factory_Method.Stage_01;

public class CdCreatorMetallicaImpl implements CdCreator {
    @Override
    public Cd createCd() {
        return new CdMetallicaImpl();
    }
}
