package lam;

import java.lang.reflect.Method;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LamTesting {

    public static void printEven(List<Integer> list){
        for (var el : list){
            if (el % 2 == 0)
                System.out.print(el + " | ");
        }
        System.out.println();
    }

    public static void printOdd(List<Integer> list){
        for (var el : list){
            if (el % 2 != 0)
                System.out.print(el + " | ");
        }
        System.out.println();
    }

    public static void printBy4(List<Integer> list){
        for (var el : list){
            if (el % 4 == 0)
                System.out.print(el + " | ");
        }
        System.out.println();
    }

    public static void print(List<Integer> list, Predicate<Integer> condition){
        for (var el : list){
            if (condition.test(el))
                System.out.print(el + " | ");
        }
        System.out.println();
    }

    public static void p(int i ,int... t){
        System.out.println(t[0]);
    }
    public static final Integer i;
    public final int j;
    static {
        System.out.println("stat");
        i = 8;
    }

    {
        System.out.println("inst");
    }

    public LamTesting() {
        this.j = 5;
    }

    public static void main(String... args) {
        new LamTesting();
        new LamTesting();new LamTesting();new LamTesting();new LamTesting();


    }
}
@FunctionalInterface
interface Cond{
    boolean test(Integer i);
   static void print(){};
}

class EvenCond implements Cond{

    @Override
    public boolean test(Integer i) {
        return i % 2 == 0;
    }
}