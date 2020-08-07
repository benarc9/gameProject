package Screens;

import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import Util.Constants;
import Util.Launcher;
import Util.Screen;

import java.awt.event.KeyEvent;

public class EndScreen extends Screen {
    private static final long serialVersionUID = 5222721195904604255L;
    private JTextArea gameOverMessage;

    public EndScreen() {
        super(Constants.Screens.EndScreen);
        setGameOverMessage();
    }

    public void restart() {
        Launcher.window.setGamePanel(new StartScreen());
    }

    private void setGameOverMessage(){
        gameOverMessage.setFont(Constants.GAME_OVER_MESSAGE_FONT);
        gameOverMessage.setText(Constants.GAME_OVER_MESSAGE);
        gameOverMessage.setAlignmentX(.5f);
        gameOverMessage.setAlignmentY(.5f);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e != null){
            Launcher.window.setGamePanel(new StartScreen());
        }
    }
}
