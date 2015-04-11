package com.nick.quiz;

import java.util.HashMap;
import java.util.Map;

class Question {
    public int currentIndex = 0;

    public static String[] questions;

     public Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
    {
        for (int i = 0; i < questions.length; i++) {
            if (i % 2 == 0)
                map.put(i, true);
            map.put(i, false);
        }
    }

    void updateQuestion(){
        currentIndex++;
    }


}