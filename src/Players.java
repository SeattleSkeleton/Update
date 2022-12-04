import java.awt.*;

public class Players extends GameObject {

    Handler handler = new Handler();

    public Players(int x, int y, ID id) {
        super(x, y, id);
        this.handler = handler;

    }

    public void tick() {
        x += velX;
        y += velY;

    }

    public void render(Graphics g) {
        if(id == ID.Tank1)  g.setColor(Color.BLUE);
        else if (id == ID.Tank2) g.setColor(Color.RED);
        g.fillRect(x, y, 32,32);


    }

}

