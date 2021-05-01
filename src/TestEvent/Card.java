
package TestEvent;

import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Card extends Parent{
    private int id;
    private String cardName;
    static  final int CARD_WIDTH = 100;
    static final int CARD_HEIGHT = 140;
    
    enum Suit {
        ATTACK1,ATTACK2,ATTACK3,ATTACK4,FAVOR1,FAVOR2,FAVOR3,FAVOR4,
        NOPE1,NOPE2,NOPE3,NOPE4,NORMAL11,NORMAL12,NORMAL13,NORMAL14,NORMAL15,
        NORMAL21,NORMAL22,NORMAL23,NORMAL24,NORMAL25,NORMAL31,NORMAL32,NORMAL33,
        NORMAL34,NORMAL35,NORMAL41,NORMAL42,NORMAL43,NORMAL44,NORMAL45,SEETHEFUTURE1,
        SEETHEFUTURE2,SEETHEFUTURE3,SEETHEFUTURE4,SHUFFLE1,SHUFFLE2,SHUFFLE3,SHUFFLE4,
        SKIP1,SKIP2,SKIP3,SKIP4;
        
        final Image image;
        
        Suit(){
           this.image = new  Image(Card.class.getResourceAsStream("OOP/".concat(name().toLowerCase()).concat(".png")),32, 32, true, true);     
        }
    } 
    
    public final Suit suit;
    
    public Card(Suit suit) {
        this.suit = suit;
        
        Rectangle bg = new Rectangle(CARD_WIDTH, CARD_HEIGHT);
        bg.setArcWidth(20);
        bg.setArcHeight(20);
        
        ImageView view = new ImageView(suit.image);
        view.setRotate(180);
        view.setX(CARD_WIDTH - 32);
        view.setY(CARD_HEIGHT - 32);
        
        getChildren().addAll(bg, new ImageView(suit.image), view);
        
        
    }   

    @Override
    public String toString() {
        return "Card{" + "id=" + id + ", cardName=" + cardName + ", suit=" + suit + '}';
    }
}
