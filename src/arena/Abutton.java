/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arena;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Mark
 */
public class Abutton extends JButton{
    
    int size = arena.Arena.level;
    ImageIcon[] icons = new ImageIcon[size];
    int xVel = 30;
    int yVel = -10;
    int speedLimit;// = arena.Arena.screen.gamePanel.speedlimit;
    public Abutton(){
        
        super();
        
        randomizeIcons();
        
    }
    
    public void makeTreasure(){
        
    this.setIcon(new ImageIcon("images/treasure.png"));
        //this.setBackground(Color.yellow);
        
    }
    
       public void randomizeIcons(){
                
        for(int i = 0; i < size; i++){ 
                    
                        icons[i] = new ImageIcon("images/treasure.png");
       }
        
        

    }
   
       
   public void makeZombie(){
       
   
       this.setIcon(new ImageIcon("images/hook.jpg"));
       
  }   
       
     public void makeHero(){
       
   
       this.setIcon(new ImageIcon("images/rms.png"));
       
  }  
   
   
     
     
    //////////////////////////////////////////////////////////////////// 
     
     
     
     
     
     
     public void move(){
     //speedLimit = arena.Arena.screen.gamePanel.speedlimit;
         int negativeSpeedLimit = speedLimit - (speedLimit*2);
         
         if(xVel > speedLimit){
             xVel = speedLimit;
         }else  if(xVel < negativeSpeedLimit){
             xVel = negativeSpeedLimit;
         }
         
         if(yVel > speedLimit){
             yVel = speedLimit;
         }else if(yVel < negativeSpeedLimit){
             yVel = negativeSpeedLimit;
         }
         
     this.setLocation(this.getX() + xVel, this.getY() + yVel); 
     
     
     
     
     
  }  
    
   
     
     
     
     
     ////////////////////////////////////////////////////////////////////////////////
     
     public void setColor(int lim){
         
         Color whatsMyColor = Color.red;
         
         if(speedLimit * 100 > lim * 80){
            whatsMyColor = Color.RED; 
         }else if(speedLimit * 100 > lim * 70){
           whatsMyColor = Color.ORANGE;  
         }else if(speedLimit * 100 > lim * 60){
           whatsMyColor = Color.YELLOW;  
         }else if(speedLimit * 100 > lim * 40){
            whatsMyColor = Color.GREEN; 
         }else if(speedLimit * 100 > lim * 30){
            whatsMyColor = Color.BLUE; 
         }else if(speedLimit * 100 > lim * 20){
           whatsMyColor = Color.MAGENTA;  
         }else{
           whatsMyColor = Color.MAGENTA;   
         }
             
         
         
         
         
         
         
         
      this.setBackground(whatsMyColor);
         
     }
     
     
     
     
     
     //////////////////////////////////////////////////////////////////////////////////////////////////
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
         public void checkCollision(){
       
       for(int i = 0; i < arena.Arena.screen.gamePanel.stuffBucketSize; i++){
          // for(int j = 0; j < arena.Arena.level; j++){
       if (this.getBounds().intersects(arena.Arena.screen.gamePanel.stuffBucket.get(i).getBounds())){
          // zombiebutton.Arena.screen.stuffBucket[i]  
                    arena.Arena.screen.gamePanel.stuffBucket.get(i).setVisible(false);
                    arena.Arena.screen.bucket.treasures[i].setVisible(true);
                    //.remove(zombiebutton.Arena.screen.gamePanel.stuffBucket[i]); 
        }     
       
       
       }
         }
       //  }
       
}
