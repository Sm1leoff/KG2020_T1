
import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    private Sun sun = new Sun(650, 100, 50, 75, 20, Color.YELLOW);
    private Background bg = new Background(Color.BLUE);
    private BackgroundHouses bgh = new BackgroundHouses(Color.GRAY);
    private Houses houses = new Houses(Color.BLACK);


    @Override
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        bg.draw(gr2d);
        sun.draw(gr2d);
        bg.drawAmountClouds(gr2d, 10);
        bg.drawAmountBirds(gr2d, 15);
        bgh.draw(gr2d);
        houses.draw(gr2d);

    }

}
