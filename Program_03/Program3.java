import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {

    public static void main(String[] args) throws Exception {

        try {

            if (args[0].equals("-v") | args[0].equals("-V")) {
                System.out.println("Program version: " + System.getProperty("os.version"));
            } else if (args[0].equals("-h") | args[0].equals("-H")) {
                System.out.println("help list:");
            }

            else if (args.length > 0) {
                // Capture the File
                File file = new File(args[0]);

                BufferedReader br = new BufferedReader(new FileReader(file));
                String st;
                while ((st = br.readLine()) != null)
                    System.out.println(st);
            }

        }

        catch (Exception e) {
            System.out.println(e);

        }
    }
}