package interview.practice.Java8;

@FunctionalInterface
interface Calculator {
    int calculate(int x, int y);
}

class Test {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;

        // lambda expression to define the calculate method
        Calculator add = Integer::sum;
        Calculator mul = (int x, int y) -> x * y;
        Calculator div = (int x, int y) -> (x / y);
        Calculator sub = (int x, int y) -> x - y;

        int ans1 = add.calculate(a, b);
        int ans2 = mul.calculate(a, b);
        double ans3 = div.calculate(a, b);
        int ans4 = sub.calculate(a, b);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);
    }
}

