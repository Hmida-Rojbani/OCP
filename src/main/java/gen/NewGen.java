package gen;

public class NewGen<T> {
    T obj;

    public NewGen(T obj) {
        this.obj = obj;
    }

    public NewGen() {

    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public <T extends Number> void printType(T u){
        System.out.println(obj.getClass().getName());
    }
}
