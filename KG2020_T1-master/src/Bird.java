import java.awt.*;

public class Bird implements Drawable {

    int x, y;

    @Override
    public void draw(Graphics2D g) {
        drawBird(g);
    }

    public Bird(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private void drawBird(Graphics2D g) {
        g.setColor(Color.black);
        g.drawLine(x, y, x + 20, y + 20);
        g.drawLine(x + 20, y + 20, x + 40, y);

    }

}
