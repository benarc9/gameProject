package Screens;

import Util.Constants;
import Util.Launcher;
import Util.Screen;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static javax.imageio.ImageIO.read;

public class StartScreen extends Screen {
    private static final long serialVersionUID = 3718213488354262104L;

    public StartScreen() {
        super(Constants.Screens.StartScreen);
        try {
            BufferedImage image = read(ClassLoader.getSystemResource("resources/title.png"));
            setBackground(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void keyReleased(KeyEvent e){
        GameScreen screen = new GameScreen();
        screen.setGrid(Launcher.game.getMap());

        Launcher.window.setGamePanel(screen);
    }
}
