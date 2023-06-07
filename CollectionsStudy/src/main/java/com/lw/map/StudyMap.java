package com.lw.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StudyMap {
    public static void main(String[] args) {
        Map<Integer, String> mmp = new HashMap<Integer, String>();
        mmp.put(1,"lw");
        mmp.put(2,"zhangsan");

        for (Entry<Integer, String > entry : mmp.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-----------------------");
        for (Integer i : mmp.keySet()) {
//            mmp.remove(1);
            System.out.println(i + ": " + mmp.get(i));
        }
        System.out.println("-----------------------");
        Iterator<Entry<Integer, String>> iterator = mmp.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<Integer, String> entry = iterator.next();
            if (entry.getKey() == 1) {
                iterator.remove();
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-----------------------");
        for (Entry<Integer, String > entry : mmp.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
