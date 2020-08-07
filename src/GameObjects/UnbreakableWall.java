package GameObjects;

import java.awt.*;

public class UnbreakableWall extends Wall {

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(this.wallImage, position.getXInt(), position.getYInt(), null);
    }
}
