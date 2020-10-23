import java.awt.*;

public class BackgroundHouses implements Drawable {
    private Color c;

    public BackgroundHouses(Color c) {
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawHouse(g, c);
        drawHouseLamp(g, c);

    }
    public static void drawHouse(Graphics2D g, Color c) {
        g.setColor(new Color(96,96,96));
        g.fillRect (550, 400, 90,200);
        g.fillRect (650, 420, 90,180);
        g.fillRect (0, 380, 60,220);
        g.fillRect (286, 300, 14,300);
        g.fillRect (511, 350, 25,250);


    }
    public static void drawHouseLamp(Graphics2D g, Color c) {
        g.setColor(Color.RED);
        g.fillRect (563, 395, 5,5);
        g.fillRect (663, 415, 5,5);
    }
}

