//import bwapi.Unit;
import bwapi.UnitType;

public class TechHandler {

    public void buildTechTree(){
        buildPool:
        for(bwapi.Unit myunit : gnombot.game.self().getUnits()){
            if (myunit.getType() == UnitType.Zerg_Drone && gnombot.game.self().minerals() >= 200){
                myunit.build(UnitType.Zerg_Spawning_Pool, gnombot.game.getBuildLocation(UnitType.Zerg_Spawning_Pool, myunit.getTilePosition(), 10, true));
                break buildPool;

            }
        }
    }
}
