package GameObjects;

import java.awt.*;
import java.io.IOException;

import static javax.imageio.ImageIO.read;

public class BreakableWall extends Wall {

    public BreakableWall() {
        try {
            setImage(read(getClass().getResource("/resources/breakableWall.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

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
