package OOPS;

public class method_overriding {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.eat();//child class ka function banaenge to child class ka 
        //method hi call hoga method overriding me
    }
}
class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Eats only grass");
    }
}
