
// System Imports:
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Program1 {

    private static final int MegaBytes = 10241024;

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
        // JVM:
        System.out.println("=================================");
        // Constants from JVM
        long FreeMemory = Runtime.getRuntime().freeMemory() / MegaBytes;
        long TotalMemory = Runtime.getRuntime().totalMemory() / MegaBytes;
        long MaxMemory = Runtime.getRuntime().maxMemory() / MegaBytes;

        System.out.println("Java Virtual Machine Properties:");
        System.out.println("Max Memory:" + MaxMemory + "mbs");
        System.out.println("Free Memory:" + FreeMemory + "mbs");
        System.out.println("Used Memory: " + (MaxMemory - FreeMemory) + "mbs");
        System.out.println("Total Memory:" + TotalMemory + "mbs");
        System.out.println("=================================");
        // Operating System Architecture:
        System.out.println("Operating System Architecture:");
        String OsName = System.getProperty("os.name");
        String OsVersion = System.getProperty("os.version");
        System.out.println("Operating System: " + OsName);
        System.out.println("Operating System Version: " + OsVersion);
        // Working Directory:
        System.out.println("=================================");
        String UserWorkingDir = System.getProperty("user.dir");
        System.out.println("User Working Directory: " + UserWorkingDir);
        System.out.println("=================================");
        System.out.println("JIT: enabled");
    }
}