package Util;

import Game.GameWindow;
import Game.TankGame;
import Screens.StartScreen;

public class Launcher {

    public static GameWindow window;
    public static TankGame game;

    public static void main(String[] args){
        game = new TankGame();
        window = new GameWindow();
        window.setGamePanel(new StartScreen());

    }

}
