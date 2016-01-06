import greenfoot.*;
import java.awt.Color;
import java.lang.Math;

public class Tarcza extends Rysunek
{
    GreenfootImage rys;
    public Tarcza(){
      setImage(new GreenfootImage(600,400));
      rys=getImage();
      rys.setColor(Color.WHITE);
      rys.setTransparency(150);
      rys.fillOval(140, 40, 320, 320);
      rys.setColor(Color.YELLOW);
      for(int i= 0 ; i<12 ; i++){    
        double kat= Math.toRadians(i*30);
        int xWiel= (int)(290 + 160*Math.cos(kat));
        int yWiel= (int)(190 + 160*Math.sin(kat));
          rys.fillOval(xWiel, yWiel, 20, 20);  
        }
    }
}