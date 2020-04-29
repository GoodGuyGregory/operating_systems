import java.util.*;
import java.io.*;

public class Program10 {

    public void interrogateDir(String DirInformation, String fileContents) {
        File folder = new File(DirInformation);
        File[] listOfDirItems = folder.listFiles();

        for (int i = 0; i < listOfDirItems.length; i++) {
            String fileHolder = listOfDirItemss[i].getName().toString();
            if (listOfDirItemss[i].isFile() && fileHolder.equals(fileContents)) {
                System.out.println(
                        "Directory in Question: \"" + listOfDirItemss[i] + "\" --- contents: \"" + fileContents + "\"");
                // break;
            } // if
            else {
                System.out.println("Directory does not contain" + "+listOfDirItemss[i]+" + fileContents);
            }
        } // for
    }// listFiles

    public static void main(String[] args) {// main

        Program10 programReader = new Program10();
        String cmdLineArg = args[0];
        String pathVariable = System.getenv("PATH");
        // System.out.println("The PATH variable is " + pathVar);
        String[] dirContents = pathVar.split(":");
        for (String eachDir : dirArray) {
            // System.out.println(eachDir);
            obj.interrogateDir(eachDir, cmdLineArg);
        }
    }
}