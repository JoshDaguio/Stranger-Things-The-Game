
package Game;

import java.awt.Color;


public abstract class MovingGameObject extends GameObject implements Moveable{
    
    int xVel;
    int yVel;
    
    // Constructor for any non controllable object
    public MovingGameObject(int xPosition, int yPosition, int xVelocity, int yVelocity, Color color)
    {
        super(xPosition, yPosition, color);
        this.xVel = xVelocity;
        this.yVel = yVelocity;
    
    }
    
    // Accessors and mutators for every part of the MovingGameObject constructor
    public int getXVelocity()
    {
        return xVel;
    }
    public int getYVelocity()
    {
        return yVel;
    }
    public void setXVelocity(int xVelocity)
    {
        this.xVel = xVelocity;
    }
    public void setYVelocity(int yVelocity)
    {
        this.yVel = yVelocity;
    }
    @Override
    
    // Used to move non controllable objects
    public void move()
    {
        this.xPos += xVel;
        this.yPos += yVel;
    }
    
}
