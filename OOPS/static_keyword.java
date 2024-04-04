public class static_keyword {

    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="KR";

        Student s2=new Student();
        System.out.println(s2.schoolName);//yha par ek empty string aani chaiye output me kyunki
        //hamne s2 obj ke liye school name define ni kiya hai par static hone ki wajah se sabhi 
        //obj me change aaega
    }
}
class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}