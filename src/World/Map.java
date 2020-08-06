package World;

import Util.MapReader;

import java.io.File;

public class Map {
    private Tile[][] tiles;
    private MapReader reader;

    public Map(int width, int height, File mapFile){
        tiles = new Tile[width][height];
        reader = new MapReader(mapFile);
    }

    public Tile getTile(int x, int y){
        return tiles[x][y];
    }
}
