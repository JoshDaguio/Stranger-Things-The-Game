
package Game;

import java.awt.Color;
import java.awt.Rectangle;

public abstract class GameObject implements Drawable {

    int xPos;
    int yPos;
    Color color;
    boolean isColliding;
    
    public GameObject(){};
    
    // Constuctor for any Game Object
    public GameObject(int xPosition, int yPosition, Color color) {
        this.xPos = xPosition;
        this.yPos = yPosition;
        this.color = color;
    }

    public abstract Rectangle getBounds();

    // Gets the X position of any object
    public int getXPosition() {
        return xPos;
    }

    // Gets the Y position of any object
    public int getYPosition() {
        return yPos;
    }

    // Gets the color of any object
    public Color getColor() {
        return color;
    }

    // Sets the X position of any object
    public void setXPosition(int xPosition) {
        this.xPos = xPosition;
    }

    // Sets the Y position of any object
    public void setYPosition(int yPosition) {
        this.yPos = yPosition;
    }

    // Sets the color of any object
    public void setColor(Color color) {
        this.color = color;
    }

    // Checks if the hitboxes of any two objects are intersecting
    public boolean isColliding(GameObject other) {
        isColliding = other.getBounds().intersects(this.getBounds());
        return isColliding;
    }
}
