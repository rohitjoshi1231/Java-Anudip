package Practise.Shopify;

public class ShoppingStore {

    public static void main(String[] args) {
        Thread[] users = new Thread[10];
        Stock stock = new Stock();
        for (int i = 0; i < users.length; i++) {
            users[i] = new Thread(stock);
            users[i].start();
        }

    }
}
