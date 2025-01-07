package Practise.Shopify;

import java.util.concurrent.locks.ReentrantLock;

public class Stock extends Thread {
    static int productCount = 0;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        checkout();
    }

    public void checkout() {
        lock.lock();
        try {
            Thread.currentThread().setName("User");
            if (productCount > 7) {
                System.out.println("Out of stock");
            } else {
                Thread.sleep(1000);
                System.out.println("Purchase Success " + Thread.currentThread().getName());
                System.out.println(productCount);
                productCount++;
            }
            lock.unlock();
        } catch (InterruptedException e) {
            System.out.println("Error...");
        }
    }

}
