package GameObjects;

import java.awt.*;

public class BreakableWall extends Wall {

    public void breakWall(){
        // Change image to broken wall image when wall is broken?
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(this.wallImage, position.getXInt(), position.getYInt(), null);
    }
}
