package GameObjects;

import Util.Constants;
import Util.GameObject;
import Util.InputMap;
import Util.KeyHandler;
import Util.Position;
import Util.Rotation;
import Util.Transform;

import java.util.Objects;
import java.io.IOException;
import java.awt.Graphics;

import java.awt.geom.AffineTransform;

import javax.swing.KeyStroke;

import Screens.StartScreen;

import java.awt.image.*;

import static javax.imageio.ImageIO.read;

import java.awt.Graphics2D;

public class Tank extends GameObject implements KeyHandler {
    private int playerId;
    private InputMap inputMap;
    private BufferedImage tankImage;
    private Graphics2D graphic;
    private Position position;
    private Transform transform;

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

            this.transform = new Transform(0);
        } else {
            inputMap.setKey(Constants.Keys.LEFT, '4');
            inputMap.setKey(Constants.Keys.RIGHT, '6');
            inputMap.setKey(Constants.Keys.FORWARD, '8');
            inputMap.setKey(Constants.Keys.BACKWARD, '2');
            inputMap.setKey(Constants.Keys.FIRE, 'L');

            this.transform = new Transform(180);
        }

        try {
            this.tankImage = read(Objects.requireNonNull(StartScreen.class.getClassLoader().getResource("tank1.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        graphic = this.tankImage.createGraphics();
    }

    @Override
    public void onKeyPress(KeyStroke e) {
        Constants.Keys key = inputMap.getKeyName(e.getKeyChar());
        if (playerId == 1)
        {
            switch(key){
                case LEFT:
                    rotateLeft();
                    break;

                case BACKWARD:
                    break;

                case FORWARD:
                    break;

                case RIGHT:
                    rotateRight();
                    break;

                case FIRE:
                    break;

                case UNDEFINED:
                    break;

                case PAUSE:
                    break;

            }
        }
        
    }


    private void rotateLeft(){
        this.transform.rotate(
            new Rotation(
                new AffineTransform(), 
                Util.Constants.Rotation.LEFT)
        );
    }

    private void rotateRight(){
        this.transform.rotate(
            new Rotation(new AffineTransform(), Util.Constants.Rotation.RIGHT)
        );
    }

    @Override
    public void update() {
        
    }

    @Override
	public void draw(Graphics g) {
		g.drawImage(this.tankImage, position.getXInt(), position.getYInt(), observer);
    }
}
        