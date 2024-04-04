package OOPS;

public class copy_constructor {
    public static void main(String[] args) {
        Studentt s1=new Studentt();
        s1.name="apna";
        s1.roll=45;
        s1.password="abc";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=60;

        Studentt s2=new Studentt(s1);
        s2.password="xyz";
//changes made after copy constructor is called should not reeflect in s2 output but it does
        s1.marks[0]=100;
        s1.marks[1]=95;
        s1.marks[2]=65;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Studentt{
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    // Studentt(Studentt s1){
    //     marks=new int[3];
    //     this.name=name;
    //     this.roll=roll;
    //     this.marks=s1.marks;
    // }

    //deep copy constructor
    Studentt(Studentt s1){
        marks=new int[3];
        this.name=name;
        this.roll=roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
    Studentt(){
        marks=new int[3];
        System.out.println("Constructor is called .....");
    }
}