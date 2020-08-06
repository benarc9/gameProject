package Util;

import java.util.HashMap;

import Util.Constants.Keys;

public class InputMap {
    private HashMap<Constants.Keys, Character> keyToName = new HashMap<>();
    private HashMap<Character, Constants.Keys> nameToKey = new HashMap<>();


    public void setKey(Keys key, char value) {
        keyToName.put(key, value);
        nameToKey.put(value, key);
    }

    public char getKey(Constants.Keys keyName){
        if (nameToKey.containsKey(keyName))
        {
            return keyToName.get(keyName);
        }
        else
        {
            System.err.println("Key: " + keyName + " has not been defined!");        
            return '0';
        }
    }

    public Constants.Keys getKeyName(Character key){
        if (keyToName.containsKey(key)){
            return nameToKey.get(key);
        }
        else{
            System.err.println("Key: " + key + " has not been defined!");
            return Constants.Keys.UNDEFINED;
        }
    }

}