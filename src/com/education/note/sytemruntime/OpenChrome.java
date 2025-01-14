package com.education.note.sytemruntime;

import java.io.IOException;

public class OpenChrome {
    public static void main(String[] args) {
        try {

            String[] command = {"/usr/bin/open", "-a", "Google Chrome","https://www.youtube.com"};
            Runtime.getRuntime().exec(command);
            System.out.println("Google Chrome opened successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while trying to open Google Chrome.");
            e.printStackTrace();
        }
    }
}

