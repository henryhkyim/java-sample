package com.hkyim.sample;

import java.util.*;

public class LambdaSample {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    System.out.println("By lambda");
    numbers.forEach(n -> System.out.println(n));
    System.out.println("By method reference");
    numbers.forEach(System.out::println);
  }
}
