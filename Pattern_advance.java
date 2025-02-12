public class Pattern_advance {
   

    //THE BUTTERFLY PATTERN

    public static void butterfly_pattern(){
        System.out.println("THE BUTTERFLY PATTERN");
        int n=5;
        for (int i = 1; i<=n ; i++) {
            for (int j = 1; j <=i; j++) {
               System.out.print("* "); 
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i>=1 ; i--) {
            for (int j = 1; j <=i; j++) {
               System.out.print("* "); 
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    // SOLID RHOMBUS

    public static void solid_rhombus(){
        System.out.println();
        System.out.println("SOLID RHOMBUS");
        int n=5;
        for (int i = 1; i<=5; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // NUMBER PYRAMID

    public static void number_pyramid(){
        int n=5;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    // PALINDROMIC PATTERN 

    public static void palindromic_pattern(){
        System.out.println();
        System.out.println("PALINDROMIC PATTERN ");
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j>=1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j<=i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
            
        }
    }

    // DIAMOND PATTERN

    public static void diamond_pattern(){
        int n=5;
        System.out.println();
        System.out.println("DIAMOND PATTERN");
     for (int i = 1; i <=5; i++) {
        for (int j = 1; j<=n-i; j++) {
            System.out.print("  ");
        }
        for (int j = 1; j <=2*i-1; j++) {
          System.out.print("* ");  
        }
        System.out.println();
     }

     for (int i = 5; i>=1; i--) {
        for (int j = 1; j<=n-i; j++) {
            System.out.print("  "); 
        }
        for (int j =1; j <=2*i-1; j++) {
           System.out.print("* "); 
        }
System.out.println();
      
     }

    }
  
     
    public static void main(String args[]){
     butterfly_pattern();
     solid_rhombus();
     number_pyramid();
     palindromic_pattern();
     diamond_pattern();

    }
}
