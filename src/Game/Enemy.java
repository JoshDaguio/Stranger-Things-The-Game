
package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Enemy extends MovingGameObject {
    
    Icon monster1 = new ImageIcon(getClass().getResource("Enemy 1.gif"));
    Icon monster2 = new ImageIcon(getClass().getResource("Enemy 2.gif"));
    Icon monster3 = new ImageIcon(getClass().getResource("Enemy 3.gif"));
    Icon boss = new ImageIcon(getClass().getResource("boss1.gif"));
    Icon boss2 = new ImageIcon(getClass().getResource("boss2.gif"));
    
    private int enemytype, width, height;

    
    // Constuctor for any enemy
    public Enemy(int xPosition, int yPosition, int xVelocity, int yVelocity, int enemyType, Color color, int width, int height) {
        super(xPosition, yPosition, xVelocity, yVelocity, color);
        this.enemytype = enemyType;
        this.width = width;
        this.height = height;
    }
    
    @Override
    // Draws monster
    public void draw(Graphics g) {
        // Varient 1
        if (this.enemytype % 3 == 0) {
            monster1.paintIcon(null, g, this.getXPosition(), this.getYPosition());
        // Varient 2
        } else if (this.enemytype % 3 == 1 && this.enemytype != 100) {
            monster2.paintIcon(null, g, this.getXPosition(), this.getYPosition());
        // Varient 3
        } else if (this.enemytype % 3 == 2) {
            monster3.paintIcon(null, g, this.getXPosition(), this.getYPosition());
        // Boss Enemy
        } if (this.enemytype == 100)
        {
            if(GamePanel.getBossHealth()>15){
                boss.paintIcon(null, g, this.getXPosition(), this.getYPosition());
            }
            else if(GamePanel.getBossHealth()>0){
                boss2.paintIcon(null, g, this.getXPosition(), this.getYPosition());
            }
          
        }
    }

    // Gets the hitbox for normal eneimes
    @Override
    public Rectangle getBounds() {
        Rectangle enemyHitBox = new Rectangle(this.getXPosition(), this.getYPosition(), width, height);
        return enemyHitBox;
    }

    // Used to move all enemies
    @Override
    public void move() {
        xPos += xVel;
    }

}
