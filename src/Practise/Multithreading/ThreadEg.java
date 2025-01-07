package Practise.Multithreading;

class ThreadEg {

}


class Thread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread of Thread 1");
    }

}

class Thread2 extends Thread {

    @Override
    public void run() {
        System.out.println("Thread of Thread 2");
    }
}

