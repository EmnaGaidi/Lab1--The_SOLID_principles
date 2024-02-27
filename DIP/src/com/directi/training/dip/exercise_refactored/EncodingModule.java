package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule {
    private IRead reader;
    private IWrite writer;
    public EncodingModule(IRead reader, IWrite writer){
        this.reader = reader;
        this.writer = writer;
    }
    public void encode() throws IOException{
        String text = reader.Read();
        String encodedLine = Base64.getEncoder().encodeToString(text.getBytes());
        writer.write(encodedLine);
    }
}
