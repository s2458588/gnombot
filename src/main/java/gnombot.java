import bwapi.*;
import bwem.*;

public class gnombot extends DefaultBWListener {
    private BWClient bwClient;
    private Game game;

    @Override
    public void onStart() {
        game = bwClient.getGame();
    }


    @Override
    public void onFrame() {
        game.drawTextScreen(100, 100, "Outdumbing opponent..");
        for (bwapi.Unit myUnit : game.self().getUnits()) {
            //if this is a hatchery/lair/hive, make it train additional worker
            if (myUnit.getType() == UnitType.Zerg_Hatchery) {
                myUnit.train(UnitType.Zerg_Drone);
                }

            else if (myUnit.getType().isWorker() && myUnit.isIdle()) {
                myUnit.rightClick(game.getStaticMinerals().get(1).getPosition() );
                //myUnit.gather(game.getStaticMinerals().get(1).getPosition() );
                System.out.println(game.getStaticMinerals().get(1).getPosition());
            }
        }
    }


    public static void main(String[] args) {
        gnombot gnombot = new gnombot();
        gnombot.bwClient = new BWClient(gnombot);
        gnombot.bwClient.startGame();
    }
}