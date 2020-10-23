import java.awt.*;

public class Houses implements Drawable {

    private Color c;
    private int x;
    private int y;
    private int height;
    private int weigh;
    private int countBlackRectangle;

    Houses(int x, int y) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.weigh = height*3/9;
        this.countBlackRectangle = countBlackRectangle;
    }

    public Houses(Color c) {
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawHousesLamp(g, c);
        fillHouses(g, c);
        fillGlassHouses(g, c);
        drawHouse1Form(g, c);
        drawHouse2Form(g, c);

        g.setColor(new Color(0,0,0));
        for(int i = 0; i < countBlackRectangle; i++){
            int newX = Random.interval(x-(int)(weigh * 0.167),x + (int)(weigh * 0.167) - 5);
            g.fillRect(newX,Random.interval(y-(int)(height * 0.3),y - 4),Random.interval(5,(int)(weigh * 0.167 + x - newX)),(int)(height*0.03));
        }


    }
    public static void drawHouse1Form(Graphics2D g, Color c) {
        g.setColor(Color.BLACK);
        g.drawLine(75, 600, 75, 100);
        g.drawLine(85, 600, 85, 110);
        g.drawLine(275, 600, 275, 110);
        g.drawLine(285, 600, 285, 100);
        g.drawLine(75, 100, 285, 100);
        g.drawLine(85, 110, 275, 110);



    }
    public static void drawHouse2Form(Graphics2D g, Color c) {
        g.setColor(Color.BLACK);
        g.drawLine(300, 600, 300, 140);
        g.drawLine(310, 600, 310, 150);
        g.drawLine(500, 600, 500, 150);
        g.drawLine(510, 600, 510, 140);
        g.drawLine(310, 150, 500, 150);
        g.drawLine(300, 140, 510, 140);


    }
    public static void fillHouses(Graphics2D g, Color c){
        g.setColor(Color.GRAY);
        g.fillRect (75, 100, 10,500);
        g.fillRect (85, 100, 200,10);
        g.fillRect (275, 100, 10,500);
        g.fillRect (500, 140, 10,460);
        g.fillRect (300, 140, 10,460);
        g.fillRect (300, 140, 200,10);
    }
    public static void fillGlassHouses(Graphics2D g, Color c){
        g.setColor(new Color (156, 173, 183));
        g.fillRect (85, 110, 190,490);
        g.fillRect (310, 150, 190,450);
    }
    public static void drawHousesLamp(Graphics2D g, Color c){
        g.setColor(Color.GRAY);
        g.fillRect (100, 40, 5,60);
        g.fillRect (340, 80, 5,60);
        g.setColor(Color.RED);
        g.fillRect (98, 40, 10,10);
        g.fillRect (338, 80, 10,10);
    }

}
