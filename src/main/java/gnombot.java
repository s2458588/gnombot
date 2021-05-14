import bwapi.*;
import bwem.*;

public class gnombot extends DefaultBWListener {
    public BWClient bwClient;
    public static Game game;

    EcoHandler eco = new EcoHandler();
    TechHandler tech = new TechHandler();

    public static int mins;
    //public int pingas;

    @Override
    public void onStart() {
        game = bwClient.getGame();

    }


    @Override
    public void onFrame() {
        eco.workerTest();
        eco.idleWorkerMine();
        tech.buildTechTree();
    }




    public static void main(String[] args) {
        gnombot gnombot = new gnombot();
        gnombot.bwClient = new BWClient(gnombot);
        gnombot.bwClient.startGame();

        mins = game.self().minerals();


    }
}

