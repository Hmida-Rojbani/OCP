package cls.des.cls.enm;

enum Season {
    WINTER("gfh"){
        @Override
        public void p1() {

        }
    },SPRING(2) {
        @Override
        public void p1() {

        }
    }, SUMMER {
        @Override
        public void p1() {

        }
    }, FALL {
        @Override
        public void p1() {

        }
    };

    Season(String gfh) {
    }
    Season(int gfh) {
    }
    Season() {
    }

    public abstract void p1();
    public void p2(){

    }
}
public class Test {

    public static void main(String[] args) {
        Season s = Season.FALL;
        for (Season sai : s.values()) {

        }
    }
}
