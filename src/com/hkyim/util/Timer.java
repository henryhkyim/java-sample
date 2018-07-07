import java.util.*;

class Timer {
  public static long timeIt() {
    long startTime = System.currentTimeMillis();
    // do your task
    long endTime = System.currentTimeMillis();
    return endTime - startTime;
  }
}
