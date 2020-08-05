package Util;

import Game.GameWindow;
import Screens.StartScreen;

public class Launcher {

    public static GameWindow window;

    public static void main(String[] args){

        window = new GameWindow();
        window.setGamePanel(new StartScreen());

    }

}
