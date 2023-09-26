package interview.OOPS_CONCEPT;

//Abstraction : Hiding internal Details and showing functionality
//using abstract class
abstract class GFG{
    abstract void add();
    abstract void mul();
    abstract void div();
}

//Second Approach
// using interfaces
interface person{
    void display();
}
class student implements person{
    @Override
    public void display() {
        System.out.println("Student Class");
    }
}
class lecture implements person{
    @Override
    public void display() {
        System.out.println("Lecture class");
    }

    public class Abstraction{
        public static void main(String [] args){
            person p1 = new student();
            p1.display();
            person p2 = new lecture();
            p2.display();
        }
    }
}
