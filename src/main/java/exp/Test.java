package exp;

import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void checked() throws IOException, SQLException
    {

    }
    public static void unchecked(){

    }

    static class Res implements AutoCloseable {
        Res(){
            System.out.println("Creating Res");
        }

        @Override
        public void close() {
            System.out.println("Closing Res");
            throw new RuntimeException("Res");
        }
    }

    static class Res2 implements AutoCloseable {
        Res2(){
            System.out.println("Creating Res2");
        }

        @Override
        public void close() {
            System.out.println("Closing Res2");
            throw new RuntimeException("Res2");
        }
    }

    public static void main(String[] args) throws Exception{

        try (var r = new Res();var r2 = new Res2()){
            System.out.println("Inside Try with Resources");
            throw new RuntimeException("Inside Try with ");
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("OutSide Try with Resources");
 //       List<AutoCloseable> resources = new ArrayList<>();
//        try{
//            resources.add(new Res());
//            resources.add(new Res());
//            System.out.println("Inside Try with Resources");
//        }finally {
//            resources.forEach(r-> {
//                try {
//                    r.close();
//                } catch (Exception e) {
//                    throw new RuntimeException(e);
//                }
//            });
//        }
        Scanner sc = new Scanner(System.in);
        try ( sc ){
            int i = sc.nextInt();
            System.out.println(i);
        }catch (RuntimeException e){

            System.err.println("Cannot read number !!!");
        }

        try {
            checked();
            //System.exit(0);
        } catch (IOException | SQLException e) {
            //e = new FileNotFoundException(); Dose not compile
            System.out.println("exception");
        }catch (Exception e){
            e = new RuntimeException();
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("End");
        unchecked();
    }
}
