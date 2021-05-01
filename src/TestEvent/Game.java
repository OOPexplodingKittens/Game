
package TestEvent;

public class Game {

    private String playerName;
    private String gameRoom;
    private int numberOfPlayer;
    
    public Game(String playerName, String gameRoom, int numberOfPlayer) {
        this.playerName = playerName;
        this.gameRoom = gameRoom;
        this.numberOfPlayer = numberOfPlayer;
    }

    public void setNumberOfPlayer(int numberOfPlayer) {
        this.numberOfPlayer = numberOfPlayer;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setGameRoom(String gameRoom) {
        this.gameRoom = gameRoom;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getGameRoom() {
        return gameRoom;
    }

    public int getNumberOfPlayer() {
        return numberOfPlayer;
    }
    
    
}
