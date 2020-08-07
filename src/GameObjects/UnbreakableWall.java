package GameObjects;

import java.awt.*;
import java.io.IOException;

import static javax.imageio.ImageIO.read;

public class UnbreakableWall extends Wall {

    public UnbreakableWall() {
        try {
            setImage(read(getClass().getResource("/resources/unbreakableWall.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(this.wallImage, position.getXInt(), position.getYInt(), null);
    }
}
