package TestEvent;

public class Player {
    private String playerName;
    private Deck hand;
    private boolean isAlive;

    public Player(String playerName) {
        this.playerName = playerName;
        this.isAlive = true;
        this.hand = new Deck(playerName);
    }

    public String getPlayerName() {
        return playerName;
    }

    public Deck getHand() {
        return hand;
    }

    public boolean isIsAlive() {
        return isAlive;
    }
    
    
}
