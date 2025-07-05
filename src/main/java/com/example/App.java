package com.example;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        System.out.println("🚀 CI Pipeline Demo");
        System.out.println("Hello from GitHub, Maven, and Jenkins!");

        // Updated message
        System.out.println("Build triggered at: " + LocalDateTime.now());

        // New functionality or change
        System.out.println("This is an update to the source code!");
    }
}

