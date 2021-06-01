package com.gmg.array.ds;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        List<Integer> result = new ArrayList<>(a);
        AtomicInteger length = new AtomicInteger();
        length.set(a.size() - 1);
        a.stream().forEach(
        eachElement -> {
            result.set(length.get(),eachElement);
                    length.getAndDecrement();
                }
        );
        return  result;
    }

}