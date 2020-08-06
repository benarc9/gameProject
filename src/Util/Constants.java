package Util;

public class Constants {

    public static final int WINDOW_WIDTH = 1024;
    public static final int WINDOW_HEIGHT = 768;

    public static final String WINDOW_TITLE = "Tank Game";

    public enum Screens {
        StartScreen, EndScreen, GameScreen
    }

    public static final String GAME_OVER_MESSAGE = "Game Over!";

    public enum Keys {
        LEFT, RIGHT, FORWARD, BACKWARD, FIRE, PAUSE, UNDEFINED
    }

    public enum Rotation {
        LEFT, RIGHT
    }

    public enum Translation {
        FORWARD, BACKWARD
    }

    public enum MapSymbols{
        E, B, U
    }
}
