package com.myproject.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/3/16.
 */
public class CourseController {
  private List<String> list = new ArrayList<>();
  private List<String> list1 = new ArrayList<>();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("String");
        list.add(1,"你好11");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String str = itr.next();
            System.out.println(str);
        }
      System.out.println("hhll");
    }
}

