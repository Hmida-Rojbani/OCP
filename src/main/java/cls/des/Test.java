package cls.des;
abstract interface     aC {
    public  default Object get() {
        return "";
    };

}

abstract class  aC2 implements aC {
    public  Number get() {
        return (Number) aC.super.get();
    }

}
class Father {
    String name ="father";
    public void hi(){
        System.out.println("Hi from father");
    }

    public static void hello(){
        System.out.println("Hello from father");
    }
    public void callMyName(){
        System.out.println(getName());
    }
    public String getName() {
        return name;
    }
}

class Son extends Father {
    String name ="Son";
    public void hi(){
        System.out.println("Hi from Son");
    }

    public static void hello(){
        System.out.println("Hello from Son");
    }

    public String getName() {
        return name;
    }

    public String son() {
        return name;
    }
}
public class Test {

    public static void main(String[] args) {
        Father s = new Son();
        System.out.println(s.getName());
        s.hello();
        s.hi();
        s.callMyName();
    }
}
