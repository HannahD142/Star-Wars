/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.wars;

import java.awt.Color;

/**
 *
 * @author Hannah Dorris
 */
public class Enemy extends Character {
    public Enemy(int x, int y, Color color, int size, String name){
        super (x, y, color, size, name);
    }
    public Enemy (){
        super();
    }
    public void move() { 
        super.setDX( (int) (Math.random()*10) - 4 );
        super.setDY( (int) (Math.random()*10) - 4 );
        super.update(); 
    } 
}