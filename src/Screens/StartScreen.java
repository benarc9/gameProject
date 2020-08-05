package Screens;

import Util.Constants;
import Util.Launcher;
import Util.Screen;

import javax.swing.*;
import java.io.IOException;
import java.util.Objects;

import static javax.imageio.ImageIO.read;


public class StartScreen extends Screen {

    public StartScreen() {
        super(Constants.Screens.StartScreen);
    }

    @Override
    protected void setBackgroundImage() {
        try {
            background = read(Objects.requireNonNull(StartScreen.class.getClassLoader().getResource("title.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onKeyPress(KeyStroke e) {
        Launcher.window.setGamePanel(new GameScreen(Constants.Screens.GameScreen));
    }
}
