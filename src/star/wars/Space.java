/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.wars;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import java.util.Timer; 
import java.util.TimerTask; 

/**
 *
 * @author Hannah Dorris
 */
public class Space extends JPanel {
    final int marginX;
    final int marginY;
    private Hero hero;
    private Enemy enemy; 
    private Timer timer;

    public Space(){
        super();
        marginX = 10;
        marginY= 10;
        hero = new Hero(600, 480, Color.PINK, 30, "Hannah");
        enemy = new Enemy (300, 240, Color.GREEN, 50, "Enemy #1");
        timer = new Timer();
        timer.scheduleAtFixedRate(new ScheduleTask(), 100, 100);
    }
    @Override
      public void paintComponent(Graphics g){
         super.paintComponent(g);
         this.setBackground(Color.BLACK);
         
         g.setColor(Color.WHITE);
         drawStars(g);
         
         hero.draw(g);
         enemy.draw(g);
         }
      private class ScheduleTask extends TimerTask { 
          @Override
          public void run (){
          wallCollissions(hero);
          wallCollissions(enemy);
          hero.update();
          enemy.update();
          repaint();
    }
      }
       public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            hero.setDX(1);
        }
        else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            hero.setDX(-1);
         }

        else if (e.getKeyCode() == KeyEvent.VK_UP) {
            hero.setDY(-1);
        }
        else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            hero.setDY(1);
        }
    }
       
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            hero.setDX(0);
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            hero.setDX(0);
        if (e.getKeyCode() == KeyEvent.VK_UP)
            hero.setDY(0);
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            hero.setDY(0);
    }
        /*this.setBackground(new Color (19, 14, 47, 1));
        g.setColor(new Color (237, 233, 227, 1));*/
      private void drawStars(Graphics g) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 1000; i++) {
          y = (int) (Math.random()*960);
          x = (int) (Math.random()*1200);
          Color curr = g.getColor();
          if (x % 2 == 0) 
              g.setColor(curr.brighter());
          else
              g.setColor(curr.darker());
          g.fillOval(x, y, 3, 3);
          
          System.out.println(x+" "+y);
          //if ( x > 1100 || y > 860) {
           //  break;
          //}
        }
    }
    
    /**
     * Makes the hero and enemy bounce off walls
     */    
    private void wallCollissions(Character c) {
        //TODO Implement this method
        //walls = this.getWidth(), this.getHeight()
        //where is the hero = hero.getX() and hero.getY()
        if (c.getX()< 0 || c.getX() +20 >= this.getWidth() ){
            c.reverseX();
        }
        if (c.getY() <= 0 || c.getY() +20 >= this.getHeight()){
            c.reverseY();
        }
    }
      }
