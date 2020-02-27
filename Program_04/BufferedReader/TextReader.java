import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {
    public static void main(String[] args) throws IOException {

        File f = new File(args[0]); // Creation of File Descriptor for input file

        FileReader fr = new FileReader(f); // Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); // Creation of BufferedReader object
        int c = 0;
        while ((c = br.read()) != -1) // Read char by Char
        {
            char character = (char) c;
            switch (toLowerCase(character)) {
                case 'a':
                    // Call Cub_1.put()
                    System.out.println('a');
                    break;
                case 'e':
                    // Call Cub_1.put()
                    System.out.println('e');
                    break;
                case 'i':
                    // Call Cub_1.put()
                    System.out.println('i');
                    break;
                case 'o':
                    // Call Cub_1.put()
                    System.out.println('o');
                    break;
                case 'u':
                    // Call Cub_1.put()
                    System.out.println('u');
                    break;
                default:
                    // Call Cub_2.put()
                    System.out.println("Other Letter");
                    ;
            }
        }

        // File Done! Sends . to both consumers:

    }
}