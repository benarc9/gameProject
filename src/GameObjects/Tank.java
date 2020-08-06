package GameObjects;

import Util.Constants;
import Util.GameObject;
import Util.InputMap;
import Util.KeyHandler;
import Util.Position;

import java.util.HashMap;
import java.util.Objects;
import java.awt.Image;
import java.awt.Graphics;

import javax.swing.KeyStroke;

import Screens.StartScreen;

public class Tank extends GameObject implements KeyHandler {
    private int playerId;
    private InputMap inputMap = new InputMap();
    private HashMap<Character, String> reverseMap = new HashMap<>();    
    private Image tankImage = 

    public Tank(int playerId) {
        this.playerId = playerId;

        if (playerId == 1)
        {
            inputMap.setKey(Constants.Keys.LEFT, 'A');
            inputMap.setKey(Constants.Keys.RIGHT, 'D');
            inputMap.setKey(Constants.Keys.FORWARD, 'W');
            inputMap.setKey(Constants.Keys.BACKWARD, 'S');
            inputMap.setKey(Constants.Keys.FIRE, 'G');
        }
        else
        {
            inputMap.setKey(Constants.Keys.LEFT, '4');
            inputMap.setKey(Constants.Keys.RIGHT, '6');
            inputMap.setKey(Constants.Keys.FORWARD, '8');
            inputMap.setKey(Constants.Keys.BACKWARD, '2');
            inputMap.setKey(Constants.Keys.FIRE, 'L');
        }

        this.tankImage = read(Objects.requireNonNull(StartScreen.class.getClassLoader().getResource("tank1.png")));
    }

    @Override
    public void onKeyPress(KeyStroke e) {
        Constants.Keys key = inputMap.getKeyName(e.getKeyChar());
        if (playerId == 1)
        {
            switch(key){
                case LEFT:
                    break;

                case BACKWARD:
                    break;

                case FORWARD:
                    break;

                case RIGHT:
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

    private void assignKeys(){
    }

    @Override
    public void update() {
    }

    @Override
	public void draw(Graphics g) {
        this.tankImage = g.drawImage(img, x, y, observer);
    }
}
        