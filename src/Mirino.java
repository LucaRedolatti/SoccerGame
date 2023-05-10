/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author lucar
 */
public class Mirino extends JPanel{
    Graphics2D g2d;
    
    private int x,y;
    
    public Mirino() {
        this.setSize(815, 624);
        this.setOpaque(false);
    }
    
    public void setCoordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    @Override
    public void paint(Graphics g){
        g2d = (Graphics2D)g;
        disegna();
    }
    
    public void disegna(){
        super.paint(g2d);
        //g2d.setBackground(new Color(0,0,0,1));
        g2d.setColor(Color.blue);
        Shape circle = new Ellipse2D.Double(x - 10, y - 10, 10 * 2.0, 10 * 2.0);
        g2d.draw(circle);
    }
}
