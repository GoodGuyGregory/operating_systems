import java.util.*;
import java.io.*;
import java.lang.reflect.*;

public class Threads {

    public static void main(String[] args) {

        TestReflections obj = new TestReflections();
        Class threads = Thread.class;
        Method[] threadMethods = threads.getDeclaredMethods();
        System.out.println("List of all methods from Thread class: ");
        for (Method threadMethod : threadMethods) {
            System.out.println(threadMethod.getName());
        } // foreach

    }// main
}// class

class TestReflections extends Thread {

    TestReflections() {
    }

    public void testMethod() {
        System.out.println("This is a test method");
    }// testMethod

}// class
