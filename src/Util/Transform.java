package Util;

import java.util.LinkedList;
import java.awt.geom.*;

import Util.Constants.Translation;

public class Transform {
    private LinkedList<Rotation> rotations = new LinkedList<>();
    private LinkedList<Translation> translations = new LinkedList<>();
    private int facingDegree;
    private int startingDir;
    private AffineTransform rotateTransform = new AffineTransform();
    private AffineTransform identity = new AffineTransform();

    public Transform(int startingDir){
        this.startingDir = startingDir;
        this.facingDegree = startingDir;
    }

    public void rotate(Rotation rotation){
        this.rotations.add(rotation);
        if (rotation.getRotationDirection() == Constants.Rotation.LEFT){
            facingDegree--;
        }
        else{
            facingDegree++;
        }
    }   

    public void translate(Translation translation)
    {
        this.translations.add(translation);
    }

    public LinkedList<Rotation> getRotations(){
        return this.rotations;
    }

    public LinkedList<Translation> getTranslations(){
        return this.translations;
    }

    public AffineTransform getRotationTransform(){
        return this.rotateTransform;
    }

    public AffineTransform getIdentityTransform(){
        return this.identity;
    }
}