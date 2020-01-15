
// System Imports:
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Program1 {
    public static void main(String[] args) {
        // Prints Hard Coded Name:
        String name = "Greg Witt";
        System.out.println("Name: " + name);

        // Displays Current time and date:
        // Formats the Time Accordingly:
        System.out.println("=================================");
        System.out.println("Current Time: ");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss MM/dd/yyyy");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.println("=================================");

        System.out.println(java.version);

    }
}