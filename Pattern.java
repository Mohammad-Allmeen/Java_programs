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

System.out.println("The hollow rectangle is ");

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
    System.out.println("The right angle triangle is");
    for (int i = 1; i <=4; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
 }

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



    public static void main(String[] args){
    hollow_rectangle();
    right_angle();
    inverted_right_angle();
    right_angle_rotated();
    
    }
}
