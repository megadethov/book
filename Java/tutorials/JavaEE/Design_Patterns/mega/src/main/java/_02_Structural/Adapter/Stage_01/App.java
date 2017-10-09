package _02_Structural.Adapter.Stage_01;

public class App {
    public static void main(String[] args) {
        CdPlayer player = new AdapterRemoteToPlayer();
        player.playCd();
        player.stopCd();
    }
}
