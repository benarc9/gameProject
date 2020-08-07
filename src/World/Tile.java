package World;

import Util.Constants;
import Util.GameObject;
import Util.Position;

import java.awt.*;

public class Tile {
    private Position position;
    private GameObject occupant = null;

    public Tile(Position position) {
        this.position = position;
    }

    public boolean hasOccupant(){
        return occupant!=null;
    }

    public void setOccupant(GameObject occupant)
    {
        this.occupant = occupant;
    }

    public GameObject getOccupant() {
        return this.occupant;
    }
}
