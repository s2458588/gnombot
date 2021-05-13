import bwapi.*;
import bwem.*;

public class gnombot extends DefaultBWListener {
    public BWClient bwClient;
    protected Game game;

    public void getMins(){
        return game.self().get
    }

    @Override
    public void onStart() {
        game = bwClient.getGame();
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