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

    public GameWindow() {
        frame = new JFrame(Constants.WINDOW_TITLE);
        setScreenSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        frame.setVisible(true);
    }

    public void setGamePanel(Screen screen){
        frame.setVisible(false);
        for(WindowListener listener:listeners){
            listener.OnScreenChange(screen);
        }
        frame.getContentPane().add(screen, BorderLayout.CENTER);
        frame.setVisible(true);
    }

    public Graphics getGraphics(){
        return frame.getGraphics();
    }

    public void setScreenSize(int width, int height){
        frame.setSize(width, height);
    }

    public void addListener(WindowListener listener){
        listeners.add(listener);
    }

    public void update(){

    }

}
