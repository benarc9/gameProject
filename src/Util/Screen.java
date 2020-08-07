package Util;

import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public abstract class Screen extends JPanel implements KeyListener {

    private static final long serialVersionUID = 1867898199396234327L;
    protected Image background;
    private Constants.Screens screenType;

    public Screen(Constants.Screens screenType) {
        this.setSize(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT);
        this.screenType = screenType;
    }

    public void setBackground(BufferedImage image){
        this.background = image.getScaledInstance(Constants.WINDOW_WIDTH, Constants.WINDOW_HEIGHT, BufferedImage.SCALE_SMOOTH);
    }

    @Override
    public void paintComponent(Graphics graphic){
        super.paintComponent(graphic);
        graphic.drawImage(background, 0, 0,this);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released Event: " + e.toString());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed Event: " + e.toString());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed Event: " + e.toString());
    }
}
