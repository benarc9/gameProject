package Util;

public class Position {
    private float x;
    private float y;

    public Position(){
        this.x = 0;
        this.y = 0;
    }

    public Position(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float x(){
        return x;
    }

    public float y(){
        return y;
    }

    public void setX(float x){
        this.x = x;
    }

    public void sety(float y){
        this.y = y;
    }
}

