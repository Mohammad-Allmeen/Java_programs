// abstract class is used to implement the concept of OOPS which is Data Abstraction, hidding the datails and only showing the neccessary functionality to the user
// for abstract class we cannot create object 
// the abstract method is declared in the abstract class and is defined outside the abstract class that is inside the derived class
// Example a abstract class car has drive method declared and is defined in the derived class of maruti suzuki
// Abstract class can contain abstract and non abstract method but the abstract method will be only present inside the abstract class
// abstract can have public, private or protected access specifier

abstract class Car{
    public abstract void drive();

    public abstract void fly();

    public void play(){
    System.out.println("Play the Nasheed");
    }
}

class BMW extends Car{
    
    public void drive(){
        System.out.println("Drive the BMW");
    }
    public void fly(){
        System.out.println("Fly the BMW");
    }
}

public class Abstract_concept {
    public static void main(String[] args){
     BMW ob = new BMW();
     ob.drive();
    }
}
