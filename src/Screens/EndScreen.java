package Screens;

import javax.swing.JTextArea;
import javax.swing.KeyStroke;

import Util.Constants;
import Util.Launcher;
import Util.Screen;

public class EndScreen extends Screen {

    private static final long serialVersionUID = 5222721195904604255L;
    
    private JTextArea gameOverMessage;

    public EndScreen() {
        super(Constants.Screens.EndScreen);
    }

    public void restart() {
        Launcher.window.setGamePanel(new StartScreen());
    }

    @Override
    public void onKeyPress(KeyStroke e) {
        if (e != null)
        {
            restart();
        }
    }

    private void setGameOverMessage(){
        //gameOverMessage.setFont(f);
        gameOverMessage.setText(Constants.GAME_OVER_MESSAGE);
        gameOverMessage.setAlignmentX(.5f);
        gameOverMessage.setAlignmentY(.5f);
    }

    @Override
    protected void setBackgroundImage() {
        // TODO Auto-generated method stub

    }
}
