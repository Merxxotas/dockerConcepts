package com.example;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private static int count = 0;

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                count++;
                System.out.println("Message " + count);
            }
        }, 5000, 5000);
    }
}