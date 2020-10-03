
import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setColor(new Color (135, 206, 250));
        gr2d.fillRect (0, 0, 800,600);
        gr2d.setColor(new Color (95, 151, 37));
        gr2d.fillRect (0, 550, 800,600);
        gr2d.setColor(Color.GRAY);
        gr2d.fillRect (75, 100, 10,500);
        gr2d.fillRect (85, 100, 200,10);
        gr2d.fillRect (275, 100, 10,500);
        gr2d.fillRect (500, 140, 10,500);
        gr2d.fillRect (300, 140, 10,500);
        gr2d.fillRect (300, 140, 200,10);
        gr2d.fillRect (100, 40, 5,60);
        gr2d.fillRect (340, 80, 5,60);
        gr2d.setColor(new Color (156, 173, 183));
        gr2d.fillRect (85, 110, 190,600);
        gr2d.fillRect (310, 150, 190,600);
        gr2d.setColor(Color.BLACK);
        gr2d.drawLine(75, 600, 75, 100);
        gr2d.drawLine(85, 600, 85, 110);
        gr2d.drawLine(275, 600, 275, 110);
        gr2d.drawLine(285, 600, 285, 100);
        gr2d.drawLine(300, 600, 300, 140);
        gr2d.drawLine(310, 600, 310, 150);
        gr2d.drawLine(500, 600, 500, 150);
        gr2d.drawLine(510, 600, 510, 140);
        gr2d.drawLine(75, 100, 285, 100);
        gr2d.drawLine(85, 110, 275, 110);
        gr2d.drawLine(310, 150, 500, 150);
        gr2d.drawLine(300, 140, 510, 140);
        gr2d.setColor(new Color(96,96,96));
        gr2d.fillRect (550, 400, 90,600);
        gr2d.fillRect (650, 420, 90,600);
        gr2d.fillRect (0, 380, 60,600);
        gr2d.fillRect (286, 300, 14,600);
        gr2d.fillRect (511, 350, 25,600);
        gr2d.setColor(Color.WHITE);
        gr2d.drawLine(115, 150, 160, 500);
        gr2d.drawLine(145, 170, 190, 520);
        gr2d.drawLine(195, 210, 200, 270);
        gr2d.drawLine(375, 170, 390, 500);
        gr2d.drawLine(395, 220, 420, 520);
        gr2d.drawLine(425, 300, 460, 590);
        gr2d.setColor(Color.RED);
        gr2d.fillRect (98, 40, 10,10);
        gr2d.fillRect (338, 80, 10,10);
        gr2d.fillRect (563, 395, 5,5);
        gr2d.fillRect (663, 415, 5,5);







    }

}
