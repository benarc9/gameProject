package Util;

import java.awt.*;

public abstract class GameObject {
    protected Position position;

    public GameObject(){
        this.position = new Position();
    }

    public GameObject(Position position){
        this.position = position;
    }

    public Position getPosition(){
        return this.position;
    }

    public abstract void update();
    public abstract void draw(Graphics g);

    public GameObject(int x, int y){
        this.position.setX(x);
        this.position.sety(y);
    };
}