import java.util.*;
import java.io.*;

public class P03{
    static String name;
    static int rows;
    static int columns;
    static String [][] dir;
    static LinkedList<String> nameHexStringChars = new LinkedList<String>();

    static void makeDir(){
        char [] nameArray = name.toCharArray();
        int nameArrayLength = nameArray.length;
        for(int i = 0; i < nameArrayLength; i++) {
            //System.out.println(nameArray[i]);
            int ascii = (int)(nameArray[i]);
            String hexTemp = Integer.toHexString(ascii).toUpperCase();
            String[] hexTempArray = hexTemp.split("");
            //System.out.println(hexTempArray[0]);
            nameHexStringChars.add(hexTempArray[0]);
            //System.out.println(hexTempArray[1]);
            nameHexStringChars.add(hexTempArray[1]);
        }


        for(int j = 0; j < columns; j++) {
            if(j == 2) {
                dir[0][2] = String.valueOf(1);
                System.out.print(dir[0][2]);
            }
            else if (j > 6 && !nameHexStringChars.isEmpty()){
                dir[0][j] = nameHexStringChars.element();
                System.out.print(dir[0][j]);
                nameHexStringChars.removeFirst();
            }//elseif
            else {
                dir[0][j] = String.valueOf(0);
                System.out.print(dir[0][j]);
            }
        }
        System.out.println("");

        for (int i = 1; i < rows; i++) {
            int hexinc = i+1;
            String hexstrg = Integer.toHexString(hexinc);
            hexstrg = hexstrg.toUpperCase();
            if(hexinc < 16){
                hexstrg = "0" + hexstrg;
            }
            String[] hexstrary = hexstrg.split("");
	       for (int j = 0; j < columns; j++) {
               //first nibble will always be a "1" if empty
               if(j == 0){
                dir[i][j] = String.valueOf(1);
                System.out.print(dir[i][j]);
               }
               else if(j == 1){
                dir[i][j] = hexstrary[0];
                System.out.print(dir[i][j]);
               }
               else if(j == 2){
                dir[i][j] = hexstrary[1];
                System.out.print(dir[i][j]);
               }
               else{
                dir[i][j] = Integer.toString(0);
                   System.out.print(dir[i][j]);
               }//else
           }//for
          System.out.println("");
        }

      }//makedir
  public static void main(String[] args){
        name = args[0];
        rows = Integer.parseInt(args[1]);
        columns = Integer.parseInt(args[2]);
        dir = new String[rows][columns];

        makeDir();

    }//main
}//program_3
