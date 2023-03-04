package chap14;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Flavors {
 private int counter;
 public  void countIceCreamFlavors() throws InterruptedException {
 counter = 0;
 Runnable task = () -> counter++;
 LongStream.range(1, 500)
 .forEach(m -> new Thread(task).start());
 Thread.sleep(2000);
 System.out.println(counter);
 }

 public static void main(String[] args) throws InterruptedException {
  System.out.print(List.of("duck","flamingo","pelican")
          .parallelStream().parallel() // q1
          .reduce(0,
                  (Integer c1, String c2) -> c1 + c2.length(), // q2
                  (Integer s1, Integer s2) -> s1 + s2)); // q
 }
 }