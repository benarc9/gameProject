package Game;

import Util.Constants;
import Util.Screen;
import Util.WindowListener;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class GameWindow {

    private JFrame frame;
    private ArrayList<WindowListener> listeners = new ArrayList<>();
    private Screen currentScreen = null;

    public GameWindow() {
        frame = new JFrame(Constants.WINDOW_TITLE);
        setScreenSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        frame.setVisible(true);
    }

    public void setGamePanel(Screen screen){
        frame.setVisible(false);
        frame.removeKeyListener(this.currentScreen);
        if (frame.getContentPane().getComponentCount() == 1)
        {
            frame.getContentPane().remove(0);
        }
        this.currentScreen = screen;
        frame.addKeyListener(this.currentScreen);
        for(WindowListener listener:listeners){
            listener.OnScreenChange(screen);
        }
        frame.getContentPane().add(this.currentScreen, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public void setScreenSize(int width, int height){
        frame.setSize(width, height);
    }
}
