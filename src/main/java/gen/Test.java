package gen;



public class Test {

    public static void main(String[] args) {
//        OldGen g1 = new OldGen("String");
//        OldGen g2 = new OldGen(2);
//        g1.printType();
//        g2.printType();
//        int s = (Integer)g1.getObj()+5;//ClassCastException
        NewGen<String> g1 = new NewGen<>("String");
        //NewGen<Number> g2 = new NewGen<Integer>(2);
        NewGen<?> g2 = new NewGen<>();
//        NewGen<? extends Number> g3 = new NewGen<Integer>(2.5);
        NewGen<? super Integer> g4= new NewGen<Number>(2);
        Number n = Integer.valueOf(5);
//        g3.setObj(1);
        g4.setObj(1);
        //int s = g2.getObj()+5;
//        g1.printType(true);
        g2.printType(5.6);
        //g1.<Double>printType(5.6);
    }
}
