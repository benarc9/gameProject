package Screens;

import Util.Constants;
import Util.Launcher;
import Util.Screen;
import World.Map;
import World.Tile;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static javax.imageio.ImageIO.read;

public class GameScreen extends Screen {
    private static final long serialVersionUID = -8660620098344586762L;
    private GridLayout grid;

    public GameScreen() {
        super(Constants.Screens.GameScreen);

        try {
            BufferedImage image = read(getClass().getResource("/resources/map.png"));
            setBackground(image);
        } catch (IOException e) {
            e.printStackTrace();
        }

        addKeyListener(Launcher.game.getTankA());
        addKeyListener(Launcher.game.getTankB());
    }

    public void setGrid(Map map){
        this.setLayout(map.getGrid());
        int count = 1;
        for (Tile[] tiles : map.getTiles())
        {
            for(Tile tile : tiles)
            {
                if (tile.hasOccupant())
                {
//                    JLabel label = new JLabel();
//                    label.getGraphics().drawImage(tile.getOccupant().getImage(), 0, 0, this);
//                    add(label);
                }
                count++;
            }
        }
    }
}
