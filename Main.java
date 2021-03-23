package com.company;
import java.util.Arrays;
import java.util.Collections;


class SortExample
{
    public static void main(String[] args)
    {
        Integer[] arr = {2,3,1,7,11};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.printf("Modified arr[] : %s",
                Arrays.toString(arr));
    }
}


