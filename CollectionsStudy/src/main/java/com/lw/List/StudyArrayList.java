package com.lw.List;

import java.util.ArrayList;
import java.util.List;

public class StudyArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add("lw" + i);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 主要是哪些api函数
    }
}
