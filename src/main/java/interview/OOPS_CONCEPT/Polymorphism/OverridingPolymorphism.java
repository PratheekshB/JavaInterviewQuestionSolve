package interview.OOPS_CONCEPT.Polymorphism;
//Overriding : If method name is same in super class and child class
    class Vehicle{

        void run()
        {
            System.out.println("Vehicle is moving");
        }
    }
    class Car extends Vehicle{
        //defining the same method as in the parent class
        @Override
        void run(){
            System.out.println("car is running safely");
        }

        public static void main(String[] args){
            Car obj = new Car();//creating object
            obj.run();//calling method
        }
    }

