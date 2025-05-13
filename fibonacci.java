public class fibonacci {


  public static void fib(int a, int b, int n){
    if(n==0){
      return;
    }

    int sum=a+b;
    System.out.print(sum+" ");
    a=b;
    b=sum;
    fib(a,b, n-1);
    
  }
    public static void main(String args [])
    {
        int n=10;
      int n1=0;
      int n2=1;
      System.out.print(n1+" "+n2+ " ");{
        for (int i = 0; i <n; i++) {
            int n3 = n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
      }

      // By recursive function
      System.out.println();
     int a=0, b=1;
     System.out.print(a+ " "+ b+" ");
      fib(a, b, 6);
    }
}


/*
 *   int count =10;
        int n1=1;
        int n2=2;
        System.out.print(n1+ " "+n2+ " ");

        for (int i =2;i<count;i++){
            int n3 = n1+n2;
            System.out.print(n3 +" ");

            n1=n2;
            n2=n3;
        }
 */