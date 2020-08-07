package Util;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputListener implements KeyListener, WindowListener{

    private Screen screen;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(this.screen.getScreenType()){
            case StartScreen:
                screen.onKeyPress(KeyStroke.getKeyStroke(e.getKeyChar()));
                break;
            case EndScreen:
                break;
            case GameScreen:
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void OnScreenChange(Screen screen) {
        this.screen = screen;
    }
}
