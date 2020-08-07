package Game;

import Util.Constants;
import Util.InputListener;
import Util.Screen;
import World.Map;

import java.io.File;


public class TankGame {

    private InputListener input;
    private Constants.Screens screen;
    private long tick = 0;
    private Screen sc;
    private Map map;

    public TankGame() {
        this.input = new InputListener();
        File mapFile = new File(getClass().getClassLoader().getResource("mapGrid.txt").getFile());
        this.map = new Map(5, 5, mapFile);
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

    public void update(){

    }

    public void render(){
        
    }

}
