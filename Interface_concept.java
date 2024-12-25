// Interface is a concept which is used to implement the fuctionality of the Data Abstraction
// NOTE- Abstract is class and Interface is not a class, it is a reference type
// By Default every method in the interface is public abstract 
// the concept of interface is basically to show you the design by just declare the method but it is the job of you meaning the class to implement it
// Just like if you want to reach a location i will show you the path however it is your job to walk 
//Interface is a concept which is used to implement the Multiple inheritance in Java

interface A {
   public abstract void drive(); 
   void fly(); // by default "public abstract" is added before so we do not need to write it will work
}

class B implements A{
    public void drive(){
        System.out.println("Drive the car"); 
    }
    public void fly(){
        System.out.println(" Drive the car");
    }
}


public class Interface_concept {
    public static void main(String [] args){
     A obj;
     obj = new B();
     obj.drive();
     obj.fly();
    }
}
