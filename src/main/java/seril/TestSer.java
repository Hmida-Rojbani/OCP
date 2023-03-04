package seril;

import java.io.*;

class Father implements Serializable{
    protected String father;
    public Father(){
        father="father";
    }

    @Override
    public String toString() {
        return "Father{" +
                "father='" + father + '\'' +
                '}';
    }
}

class Son extends Father implements Serializable {

    String son;
    int age = 10;
    transient Boolean val = false;

    static int count = 5;

    Father fatherObj = new Father();
    public Son(){
        fatherObj.father = "objFather";
        val = true;
        son = "son";
    }

    @Override
    public String toString() {
        return "Son{" +
                "son='" + son + '\'' +
                ", age=" + age +
                ", count=" + count +
                ", val=" + val +
                ", fatherObj=" + fatherObj +
                ", father='" + father + '\'' +
                '}';
    }
}

public class TestSer {
    public static void main(String[] args) throws Exception {
        var out = new ObjectOutputStream(new FileOutputStream("out.txt"));
        Son s = new Son();
        s.son = "new Son";
        s.father = "new Father";
        out.writeObject(s);
        s.count = 8;
        var in = new ObjectInputStream(new FileInputStream("out.txt"));
        var obj = (Son) in.readObject();
        System.out.println(s);
        System.out.println(obj);

        out.close();
        in.close();
    }
}
