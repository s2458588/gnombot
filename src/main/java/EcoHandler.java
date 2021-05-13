

/*This package issues eco related commands to gnombot.java. A future goal is to implement inter-package communication*/
public class EcoHandler extends gnombot {


        public int mins = game.self().minerals();

        protected void idleWorkerMine(){
            for (bwapi.Unit myunit : game.self().getUnits()){
                if(myunit.canGather()){
                    myunit.gather(game.getStaticMinerals().get(1));
                }
            }
        }

        /*
        for (bwapi.Unit myunit : game.self().getUnits() ) {
        //if this is a hatchery/lair/hive, make it train additional worker
        if (myunit.getType() == UnitType.Zerg_Hatchery && mins >= 50) {
            myunit.train(UnitType.Zerg_Drone);
        }

        else if (myUnit.getType().isWorker() && myUnit.isIdle()) {
            myUnit.rightClick(game.getStaticMinerals().get(1).getPosition() );
            //myUnit.gather(game.getStaticMinerals().get(1).getPosition() );
            System.out.println(game.getStaticMinerals().get(1).getPosition());
        }
    }
        */
}

