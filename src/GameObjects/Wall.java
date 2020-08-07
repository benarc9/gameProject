package GameObjects;

import Util.GameObject;

import java.awt.*;

public abstract class Wall extends GameObject {
    protected Image wallImage;

    public void setWallImage(Image image) {
        this.wallImage = image;
    }
}
