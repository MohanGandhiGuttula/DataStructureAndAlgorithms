package com.gmg.array.ds;

import java.util.List;

public class ArrayReverseUsingRecurssion {

    public static List<Integer> reverseArrayRecursively(List<Integer> input){
        swapArrayElement( 0,input.size()-1, input);
        return input;
    }

    private static boolean swapArrayElement(int start, int end, List<Integer> input) {
        if(start < end){
            int temp = input.get(end);
            input.set(end,input.get(start));
            input.set(start,temp);
            return swapArrayElement (start++,end--,input);
        }else{
            return false;
        }
    }
}
