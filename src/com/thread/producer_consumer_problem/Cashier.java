package com.thread.producer_consumer_problem;

import java.util.ArrayDeque;

public class Cashier {
    ArrayDeque<Cookie> cookies = Main.cookies;

    public void consume() throws InterruptedException {

        synchronized(cookies) {

            // check if baker can produce
            while (cookies.isEmpty()) {
                // if not, wait
                System.out.println("Cashier waits!");
                cookies.wait();
            }


            // if there is space on shelf, produce
            cookies.remove();
            System.out.println("Cashier sold a cookie!\n" +
                    "Cookies currently ready for sale: " + cookies.size());
            cookies.notify();

        }
    }
}