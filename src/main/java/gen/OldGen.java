package gen;

public class OldGen {
    Object obj;

    public OldGen(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public void printType(){
        System.out.println(obj.getClass().getName());
    }
}
