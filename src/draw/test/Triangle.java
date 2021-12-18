package draw.test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;

public class Triangle extends JPanel implements ActionListener {
    Timer t = new Timer(5, this);
    int x =0, y=0, velX = 2, velY = 2;

    public void paintComponent(Graphics graphs){
        super.paintComponent(graphs);

        Graphics2D form = (Graphics2D) graphs;
        graphs.drawPolygon(new int[] {10 + x, 20 + x, 30 + x}, new int[] {100 + y, 20 + y, 100 + y}, 3);
//        Ellipse2D circle = new Ellipse2D.Double(x,y,40,40);
//        ((Graphics2D) graphs).fill(circle);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(y<0 || y > 360){
            velY = -velY;
        }
//        if(x<0 || x > 560){
//            x = -velX;
//        }

//        x += velX;
        y += velY;

        repaint();
    }
}
