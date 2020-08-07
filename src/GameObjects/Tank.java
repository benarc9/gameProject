package GameObjects;

import Util.Constants;
import Util.GameObject;
import Util.InputMap;
import Util.Position;
import Util.Rotation;
import Util.Transform;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;
import java.io.IOException;
import java.awt.Graphics;import Util.Constants;
import Util.GameObject;
import Util.InputMap;
import Util.Position;
import Util.Rotation;
import Util.Transform;

import java.awt.geom.AffineTransform;

import Screens.StartScreen;

import javax.swing.*;
import java.awt.image.*;

import static javax.imageio.ImageIO.read;

import java.awt.Graphics2D;

public class Tank extends GameObject implements KeyListener {
    private int playerId;
    private InputMap inputMap;
    private BufferedImage tankImage;
    private TankPanel tankPanel;

    public Tank(int playerId) {
        this.playerId = playerId;
        this.inputMap = new InputMap();
        this.position = new Position(0,0);


        if (playerId == 1) {
            inputMap.setKey(Constants.Keys.LEFT, 'A');
            inputMap.setKey(Constants.Keys.RIGHT, 'D');
            inputMap.setKey(Constants.Keys.FORWARD, 'W');
            inputMap.setKey(Constants.Keys.BACKWARD, 'S');
            inputMap.setKey(Constants.Keys.FIRE, 'G');
        } else {
            inputMap.setKey(Constants.Keys.LEFT, '4');
            inputMap.setKey(Constants.Keys.RIGHT, '6');
            inputMap.setKey(Constants.Keys.FORWARD, '8');
            inputMap.setKey(Constants.Keys.BACKWARD, '2');
            inputMap.setKey(Constants.Keys.FIRE, 'L');
        }

        try {
            this.tankImage = read(Objects.requireNonNull(StartScreen.class.getClassLoader().getResource("resources/tank1.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void rotateLeft(){
        AffineTransform tx = new AffineTransform();
        tx.rotate(Math.PI/4);
        tankPanel.setTx(tx);
    }

    private void rotateRight(){
        AffineTransform tx = new AffineTransform();
        tx.rotate(Math.PI/4);
        tankPanel.setTx(tx);
    }

    private void forward() {
        AffineTransform tx = new AffineTransform();
        tankPanel.setTx(tx);
    }

    private void reverse() {

    }

    private void fire() {

    }

    @Override
    public void update() {
    }

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) { }

    @Override
    public void keyReleased(KeyEvent e) {
        if (playerId == 1)
        {
            switch (e.getKeyChar())
            {
                case 'A' -> {
                    rotateLeft();
                }
                case 'D' -> {
                    rotateRight();
                }
                case 'W' -> {
                    forward();
                }
                case 'S' -> {
                    reverse();
                }
                case 'F' -> {
                    fire();
                }
            }
        }
        else
        {
            switch (e.getKeyChar())
            {
                case '4' -> {
                    rotateLeft();
                }
                case '6' -> {
                    rotateRight();
                }
                case '8' -> {
                    forward();
                }
                case '2' -> {
                    reverse();
                }
                case 'L' -> {
                    fire();
                }
            }
        }
    }

    public  class TankPanel extends JPanel {
        private  AffineTransform tx = null;

        public void setTx(AffineTransform transform)
        {
            this.tx = transform;
        }

        public void draw(Graphics g)
        {
            Graphics2D g2d = (Graphics2D)g.create();
            if (tx != null)
            {
                g2d.setTransform(tx);
                g2d.dispose();
            }
        }

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            draw(g);
        }
    }
}
        