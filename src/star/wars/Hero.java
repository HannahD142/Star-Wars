
package star.wars;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import javax.swing.Timer;

/**
 *
 * @author Hannah Dorris
 */
public class Hero extends Character {
    //Fields (variables)
   private int health; 
    //Constructor
    public Hero (){
        super();
        health = 3;
    }
    public Hero (int x, int y, Color color, int size, String name){
      super(x, y, color, size, name);
      health = 3;
     }
    public Hero (int x, int y){
        super(x, y);
    }
    // Getters
    public int getHealth (){
        return health;
    }
    //Setters
  
    //y, color, size, name
    //Public Methods
   
    public void collectCoins (){
        
    }
    public void teleport (){
        
    }
           
    //Private Methods
    private void grow (){
        
    }
    private void canTeleport (){
        
    }
}
