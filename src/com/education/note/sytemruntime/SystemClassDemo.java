package com.education.note.sytemruntime;



import java.util.Arrays;
import java.util.Properties;
import java.io.Console;

public class SystemClassDemo {

    public static void main(String[] args) {
        // Demonstrating standard output and error streams.
        System.out.println("Hello, World! This is standard output.");
        System.err.println("This is an error message using System.err.");

      // Fetching and displaying environment variables.
        String path = System.getenv("PATH");
        System.out.println("Environment Variable PATH: " + path);
        System.exit(0);
        // Retrieving system properties and displaying them.
        String osName = System.getProperty("os.name");
        System.out.println("Operating System: " + osName);

        Properties properties = System.getProperties();
        System.out.println("\nAll System Properties:");
        properties.forEach((key, value) -> System.out.println(key + ": " + value));

        // Measuring current time in milliseconds and nanoseconds.
        long start = System.nanoTime();
        System.out.println("\nCurrent Time in Millis: " + System.currentTimeMillis());
        long end = System.nanoTime();
        System.out.println("Time elapsed for the operation: " + (end - start) + " nanoseconds");

        System.out.println(System.currentTimeMillis());

        // Copying elements from one array to another.
        int[] src = {1, 2, 3, 4};
        int[] dest = new int[4];
        System.arraycopy(src, 0, dest, 0, src.length);
        System.out.println("\nCopied Array: " + Arrays.toString(dest));

        // Triggering garbage collection.
        System.gc();
        System.out.println("\nGarbage Collection suggested.");

        // Exiting the program (disabled for demonstration).
        System.out.println("\nPreparing to terminate the program...");
        // Uncomment the following line to test program termination.



    }
}

