import java.util.*;
import java.io.*;

public class Program10 {

    public void interrogateDir(String DirInformation, String fileContents) {
        File folder = new File(DirInformation);
        File[] listOfDirItems = folder.listFiles();

        for (int i = 0; i < listOfDirItems.length; i++) {
            String fileHolder = listOfDirItems[i].getName().toString();
            if (listOfDirItems[i].isFile() && fileHolder.equals(fileContents)) {
                System.out.println(
                        "Directory in Question: \"" + listOfDirItems[i] + "\" --- contents: \"" + fileContents + "\"");
                // break;
            } // if
            else if (listOfDirItems[i].isDirectory()) {
                System.out.println("Directory does not contain" + listOfDirItems[i] + fileContents);
            }
        } // for
    }// listFiles

    public static void main(String[] args) {// main

        Program10 programReader = new Program10();
        String cmdLineArg = args[0];
        String pathVariable = System.getenv("PATH");

        String[] dirContents = pathVariable.split(";");
        for (String dirElements : dirContents) {
            programReader.interrogateDir(dirElements, cmdLineArg);
        }
    }
}