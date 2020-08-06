package GameObjects;

import Util.Constants;
import Util.GameObject;
import Util.InputMap;
import Util.KeyHandler;
import Util.Position;
import Util.Rotation;
import Util.Transform;

import java.util.HashMap;
import java.util.Objects;
import java.awt.Image;
import java.io.IOException;
import java.awt.Graphics;

import java.awt.geom.AffineTransform;

import javax.swing.KeyStroke;

import Screens.StartScreen;

import static javax.imageio.ImageIO.read;

public class Tank extends GameObject implements KeyHandler {
    private int playerId;
    private InputMap inputMap;
    private Image tankImage;
    private Position position;
    private Transform transform;

    public Tank(int playerId) {
        this.playerId = playerId;
        this.inputMap = new InputMap();
        this.position = new Position(0,0);
        this.transform = new Transform(0);

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
            this.tankImage = read(Objects.requireNonNull(StartScreen.class.getClassLoader().getResource("tank1.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }
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

    }

    @Override
    public void onKeyPress(Character e) {
        // TODO Auto-generated method stub

    }

//    @Override
//    public void update() {
//        if (this.transform.getRotations().size() > 0)
//        {
//            Rotation rot = this.transform.getRotations().getFirst();
//            if (rot != null)
//            {
//                this.
//            }
//        }
//    }
//
//    @Override
//	public void draw(Graphics g) {
//
//       g.drawImage(this.tankImage, , observer);
//    }
}
        