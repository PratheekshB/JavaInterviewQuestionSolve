package interview.OOPS_CONCEPT;


//Inheritance : If one object acquires all properties of parent objects
class A{
    void method1(){}
    void method2(){}
}
class B extends A{

    void method3(){}
    void method4(){}
}


class employee {
    float salary=40000;
}
class Employer extends employee {
    int bonus=10000;
    public static void main(String[] args){
        Employer p =new Employer();
        System.out.println("Employer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}