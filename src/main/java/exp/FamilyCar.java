package exp;

import java.io.Closeable;
import java.io.IOException;

public class FamilyCar {
static class Door implements AutoCloseable {
public void close() {
System.out.print("D");
} }
static class Window implements Closeable {
public void close() throws IOException {
System.out.print("W");
throw new IOException();
} }
public static void main(String[] args) throws IOException {
var d = new Door();
try (d; var w = new Window()) {
System.out.print("T");
} catch (RuntimeException e) {
System.out.print("E");
} finally {
System.out.print("F");
 } } }