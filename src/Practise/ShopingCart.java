package Practise;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Shop implements Runnable {
    static int productCount = 0;
    final int stock = 8;
    Lock lock = new ReentrantLock();


    public void checkout() {
        lock.lock();
        Thread.currentThread().setName("User");
        try {
            if (productCount > stock) {
                System.out.println("Out of Stock for " + Thread.currentThread().getName());
            } else {
                Thread.sleep(1000);
                System.out.println("Checkout success for " + Thread.currentThread().getName());
                System.out.println(productCount);
                productCount++;
            }

        } catch (InterruptedException e) {
            System.out.println("Error: " + e);
        }
        lock.unlock();
    }

    @Override
    public void run() {
        checkout();
    }
}

public class ShopingCart {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Thread[] users = new Thread[10];
        for (int i = 0; i < users.length; i++) {
            users[i] = new Thread(shop::checkout);
            users[i].start();
        }
    }
}