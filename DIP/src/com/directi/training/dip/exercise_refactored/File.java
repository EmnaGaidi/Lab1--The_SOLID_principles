package com.directi.training.dip.exercise_refactored;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File implements IRead, IWrite{

    @Override
    public int write(String text) throws IOException {
        BufferedWriter writer = null;
        try {

            writer = new BufferedWriter(
                new FileWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt"));
            if (text != null) {
                writer.append(text);
            }
        } finally {
            if (writer != null) {
                writer.close();
            }
        }
        return 0;
    }

    @Override
    public String Read() throws IOException {
        String text = "";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(
                new FileReader("DIP/src/com/directi/training/dip/exercise_refactored/beforeEncryption.txt"));
            String aLine = reader.readLine();
            if(aLine != null){
                text += aLine+"\n";
            }
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return text;
    }
    
}
