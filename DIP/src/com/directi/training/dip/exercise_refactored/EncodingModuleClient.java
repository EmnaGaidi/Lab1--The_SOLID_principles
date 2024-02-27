package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient {
    public static void main(String[] args) throws IOException
    {
        File file = new File();
        EncodingModule encodingModule = new EncodingModule(file, file);
        encodingModule.encode();
        IRead network = new Network();
        IWrite database = new MyDatabase();
        EncodingModule encodingModule2 = new EncodingModule(network, database);
        encodingModule2.encode();
    }
}
