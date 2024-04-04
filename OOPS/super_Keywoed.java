public class super_Keywoed {
    public static void main(String[] args) {
        Horse1 h=new Horse1();
        System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is caled");
    }
}
class Horse1 extends Animal{
    Horse1(){
        super();//it is automatically called if we do not write this by us
        System.out.println("Horse constructor is called");
        super.color="brown";
    }
}