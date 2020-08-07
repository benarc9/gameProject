package World;

import GameObjects.BreakableWall;
import GameObjects.UnbreakableWall;
import Util.Constants;
import Util.Position;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

import static javax.imageio.ImageIO.read;

public class Map {
    private int horizontalSize;
    private int verticalSize;
    private GridLayout grid;
    private Tile[][] tiles;

    public Map(int width, int height, File mapFile) {
        horizontalSize = width;
        verticalSize = height;
        tiles = new Tile[width][height];
        grid = new GridLayout(width, height);
        FileReader reader = null;

        try {
            try {
                reader = new FileReader(mapFile);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    tiles[x][y] = new Tile(new Position(x, y));
                    if (Constants.MapSymbols.convert((char) reader.read()) == Constants.MapSymbols.B) {
                        BreakableWall bwall = new BreakableWall();
                        tiles[x][y].setOccupant(bwall);
                    } else if (Constants.MapSymbols.convert((char) reader.read()) == Constants.MapSymbols.U) {
                        UnbreakableWall uwall = new UnbreakableWall();
                        tiles[x][y].setOccupant(uwall);
                    }
                }
            }
        } catch (IOException e) {

        }
    }

    public int getHorizontalSize() {
        return horizontalSize;
    }

    public int getVerticalSize() {
        return verticalSize;
    }

    public GridLayout getGrid(){
        return this.grid;
    }

    public Tile[][] getTiles() {
        return tiles;
    }
}
