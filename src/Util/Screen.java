package Util;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Screen extends JPanel implements KeyHandler {

    private static final long serialVersionUID = 1867898199396234327L;
    protected Image background;
    private Constants.Screens screenType;

    public Screen(Constants.Screens screenType) {
        this.setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        this.screenType = screenType;
        setBackgroundImage();
        background.getScaledInstance(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT, BufferedImage.SCALE_SMOOTH);
        Launcher.window.setGamePanel(this);
    }

    @Override
    public virtual void OnKeyPress(KeyStroke e){};

    protected abstract void setBackgroundImage();

    public Constants.Screens getScreenType() {
        return screenType;
    }

    @Override
    public void paintComponent(Graphics graphic){
        super.paintComponent(graphic);
        graphic.drawImage(background, 0, 0, Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT, this);
    }

}
