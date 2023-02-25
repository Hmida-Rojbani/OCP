package annot;

import java.util.Arrays;




        @OCP(true)
        @OCP(true)
public class Test {
    @OCP(true)
    private String n;
    @OCP(true)
    public  int test(){
        return 0;
    }

    @Override
    public String toString() {
        return "Test{" +
                "n='" + n + '\'' +
                '}';
    }

    @SuppressWarnings("deprection")
    public static void main(String[] args) {
        Integer i = new Integer(5);
        System.out.println(Test.class.getAnnotation(OCP.class));
        System.out.println(Arrays.toString(Test.class.getAnnotations()));
    }
}
