package _02_Structural.mega.Adapter.Stage_01;

public class AdapterRemoteToPlayer extends RemoteControlPanel implements CdPlayer {

    @Override
    public void playCd() {
        super.play();
    }

    @Override
    public void stopCd() {
        super.stop();
    }
}
