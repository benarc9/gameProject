package Util;

import java.awt.*;

public abstract class GameObject {
    protected Position position;
    protected Image image;

    public GameObject(){
        this.position = new Position();
    }

    public GameObject(Position position){
        this.position = position;
    }

    public Position getPosition(){
        return this.position;
    }

    public Image getImage() {
        return this.image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public abstract void update();
    public abstract void draw(Graphics g);

    public GameObject(int x, int y){
        this.position.setX(x);
        this.position.sety(y);
    }
}