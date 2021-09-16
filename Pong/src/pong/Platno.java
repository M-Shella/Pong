package pong;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import javax.swing.Timer;

public class Platno extends JPanel implements ActionListener, KeyListener{
    Timer t = new Timer(5, this);
    double y = 0, x = 0, velY = 0, velX = 0;
    int bod1=0,bod2=0;
    boolean smerStart = true;
    double poziceX = (1000/2)-10, poziceY = (500/2)-10;
    boolean smerX;
    boolean smerY;
    public void sekunda(){
        t.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }
    
    public void fce1(){
    SwingWorker sw1 = new SwingWorker(){ 
        @Override
            protected String doInBackground() throws Exception{
                Thread.sleep(10);
                if(250+y <=40)y += 0.1;
                else if(250+y>= 460)y += -0.1;
                else y+=velY;
                repaint();
                String res = "Hotovo"; 
                return res;
            }
    };
    sw1.execute();
    }
    
    public void fce2(){
    SwingWorker sw2 = new SwingWorker(){ 
        @Override
            protected String doInBackground() throws Exception{
                Thread.sleep(10);
                if(250+x <=40)x += 0.1;
                else if(250+x>= 460)x += -0.1;
                else x+=velX;
                repaint();
                String res = "Hotovo"; 
                return res;
            }
    };
    sw2.execute();
    }
    
    public void mic(){
    SwingWorker sw3 = new SwingWorker(){ 
        @Override
            protected String doInBackground() throws Exception{
                Thread.sleep(10);
                repaint();
                
                if(poziceX>=1000-20) {smerX=false; poziceX = (1000/2)-10; poziceY = (500/2)-10;bod1++;}
                if(poziceX<=0) {smerX=true; poziceX = (1000/2)-10; poziceY = (500/2)-10;bod2++;}
                if(poziceY>=500-20) smerY=false;
                if(poziceY<=0) smerY=true;
                if((poziceY>=y+210 && poziceY<=y+290) && poziceX == 100)smerX=!smerX;
                if((poziceY>=x+210 && poziceY<=x+290) && poziceX == 890)smerX=!smerX;
                
                if(smerX==true) poziceX+=2;
                else poziceX-=2;
                if(smerY==true) poziceY+=2;
                else poziceY-=2;
                    
                String res = "Hotovo"; 
                return res;
            }
    };
    sw3.execute();
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(poziceX, poziceY, 20, 20));
        g2.fill(new Rectangle2D.Double(100, 210+y, 10, 80));
        g2.fill(new Rectangle2D.Double(900, 210+x, 10, 80));
        Font font = new Font("Serif", Font.PLAIN, 70);
        g2.setFont(font);
        g2.drawString(String.valueOf(bod1), 300, 70);
        g2.drawString(String.valueOf(bod2), 700, 70);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mic();
        fce1();
        fce2();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_W:
                velY = -2;
                break;
            case KeyEvent.VK_S:
                velY = 2;
                break;
            case KeyEvent.VK_UP:
                velX = -2;
                break;
            case KeyEvent.VK_DOWN:
                velX = 2;
                break;
            default:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_W:
                velY = 0;
                break;
            case KeyEvent.VK_S:
                velY = 0;
                break;
            case KeyEvent.VK_UP:
                velX = 0;
                break;
            case KeyEvent.VK_DOWN:
                velX = 0;
                break;
            default:
                break;
        }
    }
}
