package Game;

import Util.Constants;
import Util.InputListener;
import Util.Screen;

public class TankGame {

    private InputListener input;
    private Constants.Screens screen;
    private long tick = 0;
    private Screen sc;

    public TankGame() {
        this.input = new InputListener();
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
