package World;

import Util.GameObject;
import Util.Position;

public class Tile {
    private Position position;
    private GameObject occupant = null;

    public Tile(Position position) {
        this.position = position;
    }

    public boolean hasOccupant(){
        return occupant!=null;
    }
}
