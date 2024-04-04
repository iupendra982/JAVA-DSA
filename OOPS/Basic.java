package OOPS;

public class Basic {
    public static void main(String[] args) {
        Pen p1=new Pen();//created a object of class pen p1
        p1.setColor("Blue");//calling the set color method by dot operator
        //System.out.println(p1.color);//now we can not call this as color variable is private
        System.out.println(p1.getColor());
        p1.setTip(5);
        //System.out.println(p1.tip);//this is also not feasible as tip variable is private
        //p1.color="Yellow";//also possible but not when var is private
        //System.out.println(p1.color);
        System.out.println(p1.getTip());
        BankAccount myacc=new BankAccount();
        myacc.username="Rahul";//we can do this
      //  myacc.password="Pasw";//here we can't do any change ddirectly as it is private
      //but if we create a method inside the class where paswword is declared a method to
      //change the paswword we can do this
      myacc.setPassword("New Password");//here we have set a password
    }
}
class Pen{
    private String color;
    private int tip;

    void setColor(String newColor){
        color=newColor;
    }
    String getColor(){
        return this.color;//calling the property of the current object
    }
    void setTip(int newTip){
        tip=newTip;
    }
    int getTip(){
        return this.tip;
    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}