package com.itstaredu.demo;

import java.util.ArrayList;

/**
 * @author Hunter
 * @version 1.0, 19:04 2019/1/10
 */

public class HelloWorld {

    
    public static void main(String[] args) {
        System.out.println("helloworld");
        eat();
        ArrayList<String> strings = new ArrayList<>();
        System.out.println("args = [" + args + "]");
        System.out.println("HelloWorld.main");
        System.out.println("strings = " + strings);
        System.out.println(strings);

        ArrayList<String> list = new ArrayList<String>();
        list.add("hunter");
        list.add("reba");
        list.add("mimi");

        if (list != null) {
            
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        eat();

    }

    public static void eat(){

        System.out.println("吃饭");

    }

    public void test(){
        
    }

}


