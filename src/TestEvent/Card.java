package TestEvent;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

public class Card extends Parent{
    private int cardId;
    private final String cardName;
    private final String[] cardSet = {"ATTACK", "FAVOR", "NOPE", "SEETHEFUTURE", "SHUFFLE", "SKIP", "NORMAL1", "NORMAL2", "NORMAL3", "NORMAL4", "NORMAL5"};
    private final Image image;
    static  final int CARD_WIDTH = 100;
    static final int CARD_HEIGHT = 140;
    
    public Card(String cardName) {
        this.cardName = cardName;
        setCardId(cardName);
        this.image = randomImage(cardName);
        
        Rectangle bg = new Rectangle(CARD_WIDTH, CARD_HEIGHT);
        bg.setArcWidth(20);
        bg.setArcHeight(20);
        
        ImageView view = new ImageView(this.image);
        view.setRotate(180);
        view.setX(CARD_WIDTH - 32);
        view.setY(CARD_HEIGHT - 32);
        
        getChildren().addAll(bg, new ImageView(this.image), view);
    }
    
    public Card(int cardId) {
        this.cardId = cardId;
        this.cardName = this.cardSet[cardId];
        this.image = randomImage(this.cardSet[cardId]);     
        
        Rectangle bg = new Rectangle(CARD_WIDTH, CARD_HEIGHT);
        bg.setArcWidth(20);
        bg.setArcHeight(20);
        
        ImageView view = new ImageView(this.image);
        view.setRotate(180);
        view.setX(CARD_WIDTH - 32);
        view.setY(CARD_HEIGHT - 32);
        
        getChildren().addAll(bg, new ImageView(this.image), view);
    }

    @Override
    public String toString() {
        return "Card{" + "id=" + cardId + ", cardName=" + cardName + '}';
    }

    public int getCardId() {
        return cardId;
    }

    public String getCardName() {
        return cardName;
    }

    private void setCardId(String cardName) {
        for (int i = 0; i < this.cardSet.length; i++) {
            if (this.cardSet[i] == cardName) {
                 this.cardId = i;
                 return;
            }
        }
    }
    
    private Image randomImage(String cardName) {
        String output = cardName + String.valueOf((int)(Math.random() * 4));
        return new Image(Card.class.getResourceAsStream("pictures/".concat(output.toLowerCase()).concat(".png")),32, 32, true, true);
    }
}
