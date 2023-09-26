package interview.practice.MultiThreadding;

//Threads can be created by using two mechanisms :
//Extending the Thread class
//Implementing the Runnable Interface
//1. using Implementing the Runnable Interface
class MultithreadingDemo implements Runnable {
    MultithreadingDemo(int num) {
        System.out.println(num);
    }

    public void run() {
    }
}

class MultiThread {
    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            Thread obj = new Thread(new MultithreadingDemo(n));
            obj.start();
        }
    }
}


//2. using Extending Thread Class
class MultithreadingDemo2 extends Thread {
    MultithreadingDemo2(int num) {
        System.out.println(num);
    }

    public void run() {
    }
}

class MultiThread2 {
    public static void main(String[] args) {
        for (int n = 1; n <= 100; n++) {
            MultithreadingDemo2 obj = new MultithreadingDemo2(n);
            obj.start();
        }
    }
}