
//java does not allow more than one public class

// NOTE IMP- Every constructor in java has a super method, hence whenever an object is created of that particulat class 
// when the program enter the constructor it will first execute super method which will first execute the default constructor of the parent class 
// super.[methodname();] super method is also used to access the method or variables of the parent class
class A extends Object //Every class in JAVA extends Object class, it is automatic even if we do not mention it
{
   public A(){
    super(); // super method is always there even if we do no write it so first the super method will execute 
        System.out.println("In A constructor");
    }

    public A(int n){
     System.out.println(n+ "Value of the class A");
    }
}
     class B extends A{
        
 public B(){
    super(); 
    System.out.println("In B constructor");
 }
 public B(int a){
    //super(); // this super will call the default constructor what if we want to execute the parameterized constructor of the parent/super class. Then use super(n);
    super(a);
    System.out.println(a+" value of class B");
 }
}
public class Concept_super_this
{
    public static void main(String[] args){
    //B ob1= new B();
    System.out.println("hello world");
    int n=20;
     // when we create an object and pass the value it executes the default constructor of parent class and paramterized constructor of derived class what if we want to execute the default constructor of child/derived class 
    // here comes the concept of this keyword and method 
     B obj2= new B(n);
    }
}
