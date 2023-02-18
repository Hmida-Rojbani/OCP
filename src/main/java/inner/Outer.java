package inner;

public class Outer {
    private interface Wild{}
    private String inst="hi";
    private static String stat ="hello";
    public class Inner{
        private String inst="hi2";

        public void print(){
            System.out.println(Outer.this.inst+stat);
        }
    }

    public static class Stas{
        private String inst="hi";
        private static String stat ="hello";
        private class Log {

        }
    }

}
