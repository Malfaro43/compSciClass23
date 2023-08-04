/* This class contains examples of how to create and use custom colors in Java */
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class ImageAssignment extends JPanel
{ 
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    
    // Here are two ways to make custom colors:
    // Option 1: with an integer color code (most conveniently written in hex)
    // RGB format - RED GREEN BLUE
    Color color1 = new Color(118, 92, 72);
                           
    
    // Option 2: with the colors specified individually as integers
    // (you can use hex here too but it's less helpful)
      Color color2 = new Color(58,79,63);
      Color color3 = new Color(155, 118, 83);
    
    g.setColor(color1);
    g.fillRect(350,400,50,50);
    g.fillRect(350,350,50,50);
    g.fillRect(350,300,50,50);
    
    g.setColor(color2);
    
    
    for (int i=0;i<5;i++) {
        g.fillRect(250+i*50,250,50,50);
    }
      for (int i=0;i<3;i++) {
          g.fillRect(300+i*50,200,50,50);
      }
      g.fillRect(350, 150, 50, 50);
      
      g.setColor(color3);
      for (int i=0;i<20;i++) {
          g.fillRect(0+i*50,450,50,50);
      }
  }
}