import greenfoot.*;

public class Godzinowa extends Wskazowka
{
    public Godzinowa()
    {
      kierunek = -90;
    }
    public void ustawGodziny(int godz, int min) 
    {
      kierunek = -90 + 30 * godz + (int)(min/2.0);
      setLocation(300,200);
      setRotation(kierunek);
      move(50);
    }    
}
