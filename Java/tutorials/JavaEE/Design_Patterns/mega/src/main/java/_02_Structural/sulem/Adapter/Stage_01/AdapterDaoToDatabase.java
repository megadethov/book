package _02_Structural.sulem.Adapter.Stage_01;

public class AdapterDaoToDatabase extends Dao implements Database {
    @Override
    public void insert() {
        super.saveObject();
    }

    @Override
    public void select() {
        super.getObject();
    }

    @Override
    public void update() {
        super.updateObject();
    }

    @Override
    public void delete() {
        super.removeObject();
    }
}
