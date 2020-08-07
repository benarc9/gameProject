package Util;

import java.util.LinkedList;
import java.awt.geom.*;

import Util.Constants.Translation;

public class Transform {
    private LinkedList<Rotation> rotations = new LinkedList<>();
    private LinkedList<Translation> translations = new LinkedList<>();
    private AffineTransform rotateTransform = new AffineTransform();
    private AffineTransform identity = new AffineTransform();

    public Transform(){
    }

    public void rotate(){

    }

    public void translate()
    {

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