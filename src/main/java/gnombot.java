import bwapi.*;
//import bwem.*;

public class gnombot extends DefaultBWListener {
    public BWClient bwClient;
    public static Game game;

    EcoHandler eco = new EcoHandler();

    public int mins;
    //public int pingas;

    @Override
    public void onStart() {
        game = bwClient.getGame();

    }


    @Override
    public void onFrame() {
        eco.workerTest();
        eco.idleWorkerMine();
    }



    public static void main(String[] args) {
        gnombot gnombot = new gnombot();
        gnombot.bwClient = new BWClient(gnombot);
        gnombot.bwClient.startGame();


    }
}

