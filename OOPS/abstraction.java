public class abstraction {
    public static void main(String[] args) {
        //here we can not create a class of Animal as it is abstract class
        Horse h= new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);

        Chicken c= new Chicken();
        c.eat();
        c.walk();
        
    }
}
abstract class Animal{
    String color;

    Animal(){
        color="brown";
    }

    void eat(){
        System.out.println("Animal eats");
    }

    abstract void walk();//abstract method and it must be implemented in all its sub classes
    //else it will give error
}
class Horse extends Animal{
    void changeColor(){
        color="darkBrown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("Walks on 2 legs");
    }
}

//there is also an hierarchy in abstract constructor if we wish to do so then first 
//abstract class -->  child class --> child class 
//example for this is


// public class abstraction {
//     public static void main(String[] args) {
//         Mustang myHorse=new Mustang();
        
//     }
// }
// abstract class Animal{
//     Animal(){
//         System.out.println("Animal constructor called");
//     }
// }
// class Horse extends Animal{
//     Horse(){
//         System.out.println("Horse constructor called");
//     }

// }
// class Mustang extends Horse{
//     Mustang(){
//         System.out.println("Mustang constructor called");
//     }
// }
