package ru.itmo.java.basics.lesson4;

import ru.itmo.java.basics.lesson3.Car;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] ints = new int[10];
       System.out.println(Arrays.toString(ints));
        ints[0] =20;
        ints[2] =230;
        ints[6] =420;
        ints[8] =10;
        ints[9] =2;

        System.out.println(Arrays.toString(ints));
    }
}
