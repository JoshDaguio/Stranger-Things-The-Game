
package Game;

import Controller.KeyboardController;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Eleven extends ControlledGameObject {
    
    Icon el = new ImageIcon(getClass().getResource("Eleven (Ship).png"));
    Icon bonus = new ImageIcon(getClass().getResource("VHS Tape (Bonus - Random).png"));
    Icon hearts = new ImageIcon(getClass().getResource("Heart (Lives).png"));


    // Constructor for character
    public Eleven(int xPosition, int yPosition, Color color, KeyboardController control) {
        super(xPosition, yPosition, color, control);
    }

    // Draw bonus vhs
    public void bonusDraw(Graphics g) {
        bonus.paintIcon(null, g, this.getXPosition(), this.getYPosition());
    }

    // Draw heart for life counter
    public void lifeDraw(Graphics g) {
        hearts.paintIcon(null, g, this.getXPosition(), this.getYPosition());
    }

    // Draw player controlled character
    @Override
    public void draw(Graphics g) {
        el.paintIcon(null, g, this.getXPosition(), this.getYPosition());

    }

    // Gets the hit box for player character
    @Override
    public Rectangle getBounds() {
        Rectangle shipHitbox = new Rectangle(this.getXPosition(), this.getYPosition(), 50, 50);
        return shipHitbox;
    }

    // Used to move all character object
    @Override
    public void move() {
        // Left arrow key press
        if (control.getKeyStatus(37)) {
            xPos -= 10;
        }
        // Right arrow key press
        if (control.getKeyStatus(39)) {
            xPos += 10;
        }
        
        // Move from edge to edge without stopping
        if (xPos > 800) {
            xPos = -50;
        }
        if (xPos < -50) {
            xPos = 800;
        }
    }
}
