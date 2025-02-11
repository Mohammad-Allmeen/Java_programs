public class Pattern {


// HOLLOW RECTANGLE
     
 public static void hollow_rectangle(){
    /* 
**********
*        *
*        *
*        *
**********
*/

System.out.println("HOLLOW RECTANGLE ");

for (int i = 0; i < 5; i++) {
    for (int j = 0; j < 5; j++) {
        if(i==0|| i==5-1||j==0||j==5-1){
         System.out.print("*");
        }else{
       System.out.print(" ");
        }
    }
    System.out.println();
    
}

 }

 // RIGHT ANGLE TRIANGLE

 public static void right_angle(){
    System.out.println("THE RIGHT ANGLE TRIANGLE");
    for (int i = 1; i <=4; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
 }

 // THE INVERTED RIGHT ANGLE TRINAGLE 

 public static void inverted_right_angle(){
    System.out.println("The Inverted right angle triangle is");
    for (int i = 4; i >=1; i--) {
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
 }

 // RIGHT ANGLE TRIANGLE ROTATED 180 DEGREE 

    public static void right_angle_rotated(){
        System.out.println("RIGHT ANGLE TRIANGLE ROTATED 180 DEGREE");
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
           for (int j = 1; j <=i; j++) {
            System.out.print("*");
           }
           System.out.println();
        }
    }

// RIGHT ANGLE TRIANGLE WITH NUMBERS
public static void right_angle_numbers(){
    System.out.println("THE RIGHT ANGLE TRIANGLE WITH NUMBERS");
    for (int i = 1; i <=5; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
 }


  // THE INVERTED RIGHT ANGLE TRINAGLE WITH NUMBER

  public static void inverted_right_angle_numbers(){
    System.out.println("THE INVERTED RIGHT ANGLE TRINAGLE WITH NUMBER");
    for (int i = 5 ; i >=1; i--) {
        for (int j = 1; j <=i; j++) {
            System.out.print(j+" ");
        }
        System.out.println();
    }
 }


 // RIGHT ANGLE TRIANGLE WITH CONTINUING NUMBERS
public static void right_angle_with_continuing_number(){
    System.out.println("THE INVERTED RIGHT ANGLE TRINAGLE WITH CONTINUING NUMBER");
    int k=1;
for (int i = 1; i <=5; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(k++ +"  ");
    }
    System.out.println();
}
}

// RIGHT ANGLE WITH ZERO AND ONE 

public static void right_angle_zero_and_one(){
    for (int i = 1; i <=5; i++) {
        for (int j = 1; j <=i; j++) {
            int sum =i+j;
            if((i+j)%2==0){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }
        System.out.println();
    }
}


    public static void main(String[] args){
    hollow_rectangle();
    right_angle();
    inverted_right_angle();
    right_angle_rotated();
    right_angle_numbers();
    inverted_right_angle_numbers();
    right_angle_with_continuing_number();
    right_angle_zero_and_one();
    }
}
