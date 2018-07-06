import java.util.*;

public class LambdaSampler {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    //by lambda
    numbers.forEach(n -> System.out.println(n));
    //by method reference
    numbers.forEach(System.out::println);
  }
}
