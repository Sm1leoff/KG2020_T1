import java.awt.*;

public class Background implements Drawable {

    private Color c;

    public Background(Color c) {
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawBackground(g, c);

    }

    public static void drawBackground(Graphics2D g, Color c) {
        g.setColor(new Color(135, 206, 250));
        g.fillRect(0, 0, 800, 600);
        g.setColor(new Color(95, 151, 37));
        g.fillRect(0, 550, 800, 50);

    }

    public void drawAmountClouds(Graphics2D gr, int amountClouds) {
        for (int i = 0; i < amountClouds; i++) {
            int x = Random.interval(0, 750);
            int y = Random.interval(0, 400);
            Cloud cloud = new Cloud(x, y);
            cloud.draw(gr);
        }
    }

    public void drawAmountBirds(Graphics2D gr, int amountBirds) {
        for (int i = 0; i < amountBirds; i++) {
            int x = Random.interval(0, 750);
            int y = Random.interval(100, 400);
            Bird bird = new Bird(x, y);
            bird.draw(gr);
        }
    }
}
