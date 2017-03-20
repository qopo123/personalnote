package com.myproject.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/3/16.
 */
public class CourseController {
<<<<<<< HEAD
  private List<String> list = new ArrayList<>();
  private List<String> list1 = new ArrayList<>();
=======
>>>>>>> 633fcf47d504d09c1a32377efc257f8aab213b54
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
<<<<<<< HEAD

=======
>>>>>>> 633fcf47d504d09c1a32377efc257f8aab213b54
}

