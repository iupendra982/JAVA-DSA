

public class inheritance {
    public static void main(String[] args) {
        // Fish shark=new Fish();
        // shark.eat();

        Dog sheru=new Dog();
        sheru.eat();
        sheru.legs=4;
        System.out.println(sheru.legs);
    }
}
//Base class
class Animal{
     String color;
     void eat(){
        System.out.println("eats");
     }
     void breathe(){
        System.out.println("breathes");
     }
}

class Mammals extends Animal{
    int legs;
}
class Dog extends Mammals{
    String breed;
}

//Derived class
// class Fish extends Animal{
//     int fins;
//     void swim(){
//         System.out.println("Swims in water");
//     }
// }