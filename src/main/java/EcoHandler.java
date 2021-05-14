//import bwapi.BWClient;

import bwapi.UnitType;

/*This package issues eco related commands to gnombot.java. A future goal is to implement inter-package communication*/
public class EcoHandler {

    //public int mins = gnombot.game.self().minerals();

    protected void workerTest() {
        for (bwapi.Unit myunit : gnombot.game.self().getUnits()) {
            if (myunit.getType() == UnitType.Zerg_Hatchery && gnombot.game.self().minerals() >= 50) {
                myunit.train(UnitType.Zerg_Drone);
            }
        }
    }

    protected void idleWorkerMine() {
        int i = 0;
        for (bwapi.Unit myunit : gnombot.game.self().getUnits()) {
            if (myunit.getType() == UnitType.Zerg_Drone && myunit.isIdle()) {
                i++;
                myunit.gather(gnombot.game.getMinerals().get(i));
            }
        }
    }
}

