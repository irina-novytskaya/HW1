package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Integer[] replaceNum = {3,2,3,1,4,2,8,3};
        for (int i =0; i< replaceNum.length; i++) {
            for (int j = i + 1; j < replaceNum.length; j++) {
                if (replaceNum[i].equals(replaceNum[j])) {
                    replaceNum[j] = 0;
                } } }
        System.out.print(  Arrays.toString(replaceNum));
    }
}

