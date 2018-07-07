package com.hkyim.sample;

import java.util.*;

public class StreamSample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    // to find sum of even number
    System.out.println(
      numbers.stream()
             .filter(n -> n % 2 == 0)
             .mapToInt(n -> n)
             .sum()
    );
    System.out.println(
      numbers.stream()
             .filter(n -> n % 2 == 0)
             .reduce(0, (total, n) -> total + n)
    );
  }
}   
