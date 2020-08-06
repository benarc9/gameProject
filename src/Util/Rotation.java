package Util;

import java.awt.geom.*;

public class Rotation {
    private AffineTransform trans;
    private Constants.Rotation rotateDir;

    public Rotation(AffineTransform trans, Constants.Rotation rotateDir){
        this.trans = trans;
        this.rotateDir = rotateDir;
    }

    public Constants.Rotation getRotationDirection(){
        return rotateDir;
    }

    public AffineTransform getTransform(){
        return trans;
    }
}