import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Manu_sig extends Applet implements MouseListener {
    String color;    
    public void init() {
        // TODO start asynchronous download of heavy resources
    color="red";
    addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(color=="red"){
            color="green";
        }else{
            color="red";
        }
        repaint();
    }

    @Override
    public void paint(Graphics g) {
         if(color=="red")
    {
        g.setColor(Color.red);
        g.fillOval(100, 100, 100, 100);
    }else{
        g.setColor(Color.green);
        g.fillOval(100, 100, 100, 100);
    }
    }
    
    @Override
    public void mousePressed(MouseEvent e) {    }
    @Override
    public void mouseReleased(MouseEvent e) {    }
    @Override
    public void mouseEntered(MouseEvent e) {    }
    @Override
    public void mouseExited(MouseEvent e) {    }
}
/*Automatic Signal Control*/
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Auto_Sig extends Applet implements Runnable {
    String color; int x;
    public void init() {
        color="red";
        x=0;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while(true){
        if(x<=0 && color=="red")
        {
            color="green";            x=40;
        }else{
            color="red";            x=20;
        }
        while(x!=0){
            x-=1;
        repaint();
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {            }
        }
        }
    }

    @Override
    public void paint(Graphics g) {
    g.drawString(x+"", 50, 50);
    if(color=="red")
    {
        g.setColor(Color.red);
        g.fillOval(100, 100, 100, 100);
    }else{        g.setColor(Color.green);
        g.fillOval(100, 100, 100, 100);
    }
    }    
}
