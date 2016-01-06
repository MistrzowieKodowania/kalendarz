import greenfoot.*;
import java.util.GregorianCalendar;
import java.util.Calendar;

public class Kalendarz extends World
{
   Minutowa minutnik;
   Godzinowa godzinka; 
   Sekundnik sekundnik; 
   Tarcza tarcza;
   AktualnaData data;
    public Kalendarz()
    {    
        super(600, 400, 1); 
        minutnik = new Minutowa();
        godzinka = new Godzinowa();
        sekundnik = new Sekundnik();
        tarcza = new Tarcza();
        data = new AktualnaData();
        addObject(data, 300, 15);
        addObject(tarcza, 300,200);
        addObject(minutnik,300,200);
        addObject(godzinka,300,200);
        addObject(sekundnik, 300,200);
    }
    
    public void act(){
       GregorianCalendar dzis = new GregorianCalendar();
       int dzienTyg = dzis.get(Calendar.DAY_OF_WEEK);
       int dzien = dzis.get(Calendar.DAY_OF_MONTH);
       int miesiac = dzis.get(Calendar.MONTH);
       int rok = dzis.get(Calendar.YEAR);
       int sekundy = dzis.get(Calendar.SECOND);
       int minuty = dzis.get(Calendar.MINUTE);
       int godziny = dzis.get(Calendar.HOUR);
       data.ustawDate(dzienTyg, dzien, miesiac, rok);
       godzinka.ustawGodziny(godziny,minuty);
       minutnik.ustawMinuty(minuty);
       sekundnik.ustawSekundy(sekundy);
    }
}
