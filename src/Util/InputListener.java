package Util;

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

                break;
            case EndScreen:
                break;
            case GameWindow:
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
