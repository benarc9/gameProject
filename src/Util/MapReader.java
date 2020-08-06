package Util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MapReader {

    public MapReader(File mapFile){
        if(mapFile.exists()){
            try {
                FileReader reader = new FileReader(mapFile);
                char mapChar;
                while((mapChar = (char)reader.read())!= -1){
                    System.out.print(mapChar);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
