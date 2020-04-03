import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleMain {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String x = null;
        while ((x = input.readLine()) != null) {
            System.out.println(x);
        }
    }
}