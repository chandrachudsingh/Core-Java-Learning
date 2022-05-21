import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderClass extends Applet implements Runnable 
{ 
   Font F;
   Thread t = null;  
   int hours=0, minutes=0, seconds=0;  
   String timeString = "";  
  
   public void init() {  
      F=new Font("comic sans",Font.PLAIN,50);
   }  
  
   public void start() {  
        t = new Thread( this );  
        t.start();  
   }  
  
    
   public void run() {  
      try {  
         while (true) {  
  
            Calendar cal = Calendar.getInstance();  
  
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss a");  
            Date date = cal.getTime();  
            timeString = formatter.format( date );  
  
            repaint();  
            t.sleep( 1000 );  // interval given in milliseconds  
         }  
      }  
      catch (Exception e) { }  
   }  
  
    
  public void paint( Graphics g ) {   
      g.setFont(F);
      g.drawString( timeString, 50, 50 );  
   }  
} 