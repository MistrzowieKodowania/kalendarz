import greenfoot.*;

public class Minutowa extends Wskazowka
{
    public Minutowa(){
        kierunek = -40;
    }
    public void ustawMinuty(int min) 
    {
      kierunek = -90 + 6 * min;
      setLocation(300,200);
      setRotation(kierunek);
      move(70);
    }   
}
