import javax.swing.*;
//java does not allow more than one public class
class A
{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A{
        //this same method in derived class/child class will overriden(means we can make changes) the method of base class/parent class
    public void show(){
    
      System.out.println(" In B show");
    }
}
public class Method_overriding 
{
    public static void main(String[] args){
    B ob1= new B();
    ob1.show();
    }
}
