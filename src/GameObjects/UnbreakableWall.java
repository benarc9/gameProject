package GameObjects;

import Screens.StartScreen;

import java.awt.*;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.util.Objects;

import static javax.imageio.ImageIO.read;

public class UnbreakableWall extends Walls {

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g) {
        ImageObserver ob = new ImageObserver() {
            @Override
            public boolean imageUpdate(Image img, int infoflags, int x, int y, int width, int height) {
                return false;
            }
        };
        //g.drawImage("unbreakableWall.png", position.getXInt(), position.getYInt(), ob);
    }
}
