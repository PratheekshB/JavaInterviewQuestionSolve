package interview.practice.MultiThreadding;
//using Extend Thread
class PrintNumbers extends  Thread {
    PrintNumbers(int num) {
        System.out.println(num);
    }
    public void run() {
    }
   public static class Multithreading {
        public static void main(String[] args) {

            for (int n = 0; n <= 100; n++) {
                PrintNumbers printNumbers = new PrintNumbers(n);
                printNumbers.start();
            }
        }
    }
}
