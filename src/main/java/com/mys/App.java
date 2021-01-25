package com.mys;

public class App {

    public static String getReverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(App.getReverseString("hello"));
    }
}
