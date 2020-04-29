import java.util.*;
import java.io.*;

public class Program10 {

    public void interrogateDir(String dirString, String filename) {
        File folder = new File(dirString);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            String fileTemp = listOfFiles[i].getName().toString();
            if (listOfFiles[i].isFile() && fileTemp.equals(filename)) {
                System.out.println("Directory: \"" + listOfFiles[i] + "\" --- contains: \"" + filename + "\"");
                // break;
            } // if
            else {
                System.out.println("Directory"  + "+listOfFiles[i]+"  + "does not contain"
                + filename);
            }
        } // for
    }// listFiles

    public static void main(String[] args) {// main

        Program10 obj = new Program10();
        String commdLineArgument = args[0];
        // String cmdLineArgment = args[1];
        // String cmdLineTwo
        // System.out.println("Command line argument is " + cmdLineArg);
        // System.out.println("Second Command is " + cmdLineArg2);
        String pathVar = System.getenv("PATH");
        // System.out.println("The PATH variable is " + pathVar);
        String[] dirArray = pathVar.split(":");
        for (String eachDir : dirArray) {
            // System.out.println(eachDir);
            obj.interrogateDir(eachDir, cmdLineArg);
        } // foreach

    }// main
}// class