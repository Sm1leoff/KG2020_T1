import java.awt.*;

public class Cloud implements Drawable {

    private int x;
    private int y;

    Cloud(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        drawCloud(g);
    }

    private void drawCloud(Graphics2D gr) {
        gr.setColor(Color.white);
        gr.fillOval(x, y, 100, 50);
        gr.fillOval(x + 40, y - 15, 50, 50);
        gr.fillOval(x + 20, y - 20, 50, 50);
    }


}
