package interview.OOPS_CONCEPT.Polymorphism;

// Polymorphism: If one task performed in different way
//Overloading Polymorphism: If one or more methods having same class having same method name different parameters
public class OverLoadingPolymorphism {
    public static void main(String[] args) {
        OverLoadingPolymorphism s = new OverLoadingPolymorphism();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(10.5, 20.5));
    }

    public int sum(int x, int y) {
        return (x + y);
    }

    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    public double sum(double x, double y) {
        return (x + y);
    }
}

