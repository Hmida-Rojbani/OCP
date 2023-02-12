package inner.main;
import inner.Outer;
import inner.Outer.Inner;

import java.util.function.Predicate;

import static inner.Outer.Stas;
public class Main {
    public static void main(String[] args) {
        Outer t = new Outer();
        // Test.Inner v = t. new Inner();
        Inner v = new Outer().new Inner();
        v.print();

        //Outer.Stas s = new Outer.Stas();
        Stas s = new Stas();

        class C {
            int s = 5;
            int ss1 =5;

            public void print(){
                System.out.println("hello from c");
            }
        }
        new C().print();

        Predicate<Integer> pre = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };
        var o = new O(){};
        System.out.println(o.getClass().getName());
    }
}

abstract class O {
    public void print(){

    }
}