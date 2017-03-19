package com.myproject.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/3/16.
 */
public class CourseController {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("String");
        list.add(1,"hello");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }
    }
}

