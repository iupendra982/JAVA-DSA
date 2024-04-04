package OOPS;

public class constructor {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("Upendra");
        Student s3=new Student(5);
    }
}
class Student{
    String name;
    int roll;
//non-parameterized constructor
    Student(){
        System.out.println("Constructor is called");
    }
    //parametrized constructor
    Student(String name){//initialized constructor
        this.name=name;
    }

    Student(int roll){
        this.roll=roll;
    }
}
