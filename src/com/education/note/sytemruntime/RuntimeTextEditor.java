package com.education.note.sytemruntime;


import java.io.FileWriter;
import java.io.IOException;

public class RuntimeTextEditor {
    public static void main(String[] args) {
        try {
            // Create and write to a temporary text file
            String filePath = "/tmp/hello_world.txt"; // macOS/Linux temp directory
            FileWriter writer = new FileWriter(filePath);
            writer.write("Hello, i am abhinav bbbbbbbbbbbbbbbbbbbbhfdhfdhfdhfdhfdhdfhfhdfhdfhdfhdfhfdhdfhdfhdfdhdfhdfh!");
            writer.close();


            String[] command = {"/usr/bin/open", "-a", "TextEdit", filePath};
            Runtime.getRuntime().gc();


            System.out.println(Runtime.getRuntime().maxMemory());

            System.out.println("Text editor opened with 'Hello, World!' written inside.");
        } catch (IOException e) {
            System.out.println("An error occurred while trying to open the text editor.");
            e.printStackTrace();
        }
    }
}
