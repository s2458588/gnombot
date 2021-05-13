import bwapi.*;
//import bwem.*;

public class gnombot extends DefaultBWListener {
    public BWClient bwClient;
    protected Game game;

    EcoHandler eco = new EcoHandler();
    //public int mins = game.self().minerals();
    //public int pingas = game.self().gas();

    @Override
    public void onStart() {
        game = bwClient.getGame();
        eco.idleWorkerMine();
    }


    @Override
    public void onFrame() {
    }



    public static void main(String[] args) {
        gnombot gnombot = new gnombot();
        gnombot.bwClient = new BWClient(gnombot);
        gnombot.bwClient.startGame();


    }
}