package Util;

import java.awt.*;

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
        E, B, U;

        public static MapSymbols convert(char symbol)
        {
            if (symbol == 'E')
            {
                return MapSymbols.E;
            }
            else if (symbol == 'U')
            {
                return MapSymbols.U;
            }
            else
            {
                return MapSymbols.B;
            }
        }
    }

    public static final int TILE_WIDTH = 32;
    public static final int TILE_HEIGHT = 32;

    public static final Font GAME_OVER_MESSAGE_FONT = GraphicsEnvironment.getLocalGraphicsEnvironment().getAllFonts()[0];
}
