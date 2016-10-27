package main;

import enums.DeckType;
import players.Player;
import java.util.ArrayList;
import java.util.List;
import players.RealPlayer;

/**
 *
 * @author Zsolt
 */
public class Quizmaster {
    
    private static final Quizmaster INSTANCE = new Quizmaster();
    private Deck deck;
    private List<Player> players;

    public static Quizmaster getINSTANCE() {
        return INSTANCE;
    }

    private Quizmaster() {
        players = new ArrayList<>();
    }

    public void playGame(List<Player> players) {
        initialize(players);
    }

    private void initialize(List<Player> players) {
        this.deck = new Deck(DeckType.MASTER);
        this.players = players;
    }
    
}
