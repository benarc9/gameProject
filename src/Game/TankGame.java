package Game;

import GameObjects.Tank;
import World.Map;
import java.io.File;

public class TankGame {
    private long tick = 0;
    private Map map;
    private Tank tankA;
    private Tank tankB;

    public TankGame() {
        File mapFile = new File(getClass().getResource("/resources/mapGrid.txt").getFile());
        this.map = new Map(17, 13, mapFile);
        this.tankA = new Tank(1);
        this.tankB = new Tank(2);
    }

    public void run(){
        try{
            while(true){
                this.tick++;
                update();
                render();
                Thread.sleep(1000/144);
            }
        }catch (InterruptedException in){
            System.out.println(in);
        }
    }

    public Map getMap() {
        return this.map;
    }

    public Tank getTankA()
    {
        return tankA;
    }

    public Tank getTankB()
    {
        return tankB;
    }

    public void update(){

    }

    public void render(){
        
    }

}
