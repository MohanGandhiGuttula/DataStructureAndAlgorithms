package com.gmg.array.ds;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ArraysRevers {
        public static void main(String[] args) throws IOException {
          //  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
           // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arrCount = 4;//Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> arr = new ArrayList <Integer>(Arrays.asList(1,4,5,7));
            /*Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());*/

            List<Integer> res = ArrayReverseUsingRecurssion.reverseArrayRecursively(arr);
            res.stream().forEach(eachElement -> System.out.println(eachElement));

            /*bufferedWriter.write(
                    res.stream()
                            .map(Object::toString)
                            .collect(joining(" "))
                            + "\n"
            );*/

            //bufferedReader.close();
            //bufferedWriter.close();
        }
}
