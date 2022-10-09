package org.collections;

import java.util.HashMap;
import java.util.Map;

public class Numbers{
        Map<String, Integer> marks = new HashMap<>();

        public void addMark(String key, int value){
            marks.put(key,value);
        }
        public void findMark(Integer mark){
            for (Map.Entry<String, Integer> entry : marks.entrySet()) {
               if(entry.getValue().equals(mark)){
                   String keyString = entry.getKey().toString();
                   String valueString = mark.toString();
                   System.out.println(keyString + ":" + valueString);
               }
            }
        }
    }



