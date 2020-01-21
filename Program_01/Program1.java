
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

        // Java Version:
        String JavaVersion = System.getProperty("java.version");
        System.out.println("Java Version: " + JavaVersion);

        String JavaVendor = System.getProperty("java.vendor");
        System.out.println("Java Vendor: " + JavaVendor);

        System.out.println("=================================");

        System.out.println("=================================");
        // Operating System Architecture:
        System.out.println("Operating System Architecture:");
        String OsName = System.getProperty("os.name");
        String OsVersion = System.getProperty("os.version");

        System.out.println("Operating System: " + OsName);
        System.out.println("Operating System Version: " + OsVersion);

        System.out.println("=================================");
        String UserWorkingDir = System.getProperty("user.dir");
        System.out.println("User Working Directory: " + UserWorkingDir);
    }
}