package chap14;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        executorService.submit(() -> {
            for (int i = 0; i < 1000L; i++) {

            }
            System.out.println("hello");
        });
        executorService.submit(() -> {
            for (int i = 0; i < 1000L; i++) {

            }
            System.out.println("hello");
        });
        executorService.submit(() -> {
            for (int i = 0; i < 1000L; i++) {

            }
            System.out.println("hello");
        });
        executorService.submit(() -> {
            for (int i = 0; i < 1000L; i++) {

            }
            System.out.println("hello");
        });
        executorService.shutdown();
    }
}
