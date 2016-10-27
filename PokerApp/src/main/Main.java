package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import players.Decision;
import players.Player;
import players.RealPlayer;

/**
 *
 * @author Zsolt
 */
public class Main {
    
    public static List<Player> init() {
        List<Player> players = new ArrayList<>();
        Player player1 = new RealPlayer("Adolf", new Long(500));
        Player player2 = new RealPlayer("Bormann", new Long(750));
        Player player3 = new RealPlayer("Conrad", new Long(1000));
        players.add(player1);
        players.add(player2);
        players.add(player3);
        return players;
    }
    
    public static void main(String[] args) {
        Quizmaster quizmaster = Quizmaster.getINSTANCE();
        quizmaster.playGame(init());
    }
}
