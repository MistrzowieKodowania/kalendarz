import greenfoot.*;

public class Sekundnik extends Wskazowka
{
    public Sekundnik(){
        kierunek = 0;
        }
    public void ustawSekundy(int s) 
    {
      kierunek = -90 + 6 * s;
      setLocation(300,200);
      setRotation(kierunek);
      move(75);
    }    
}
