package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MyDatabase implements IWrite{

    private static Map<Integer, String> _data = new HashMap<>();
    private static int _count = 0;
    @Override
    public int write(String inputString) throws IOException {
        _data.put(++_count, inputString);
        return _count;
    }
    
}
