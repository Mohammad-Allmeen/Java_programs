public class fibonacci {
    public static void main(String args [])
    {
        int n=10;
      int n1=0;
      int n2=1;
      System.out.println(n1+" "+n2+ " ");{
        for (int i = 0; i <n; i++) {
            int n3 = n1+n2;
            System.out.println(n3+" ");
            n1=n2;
            n2=n3;
        }
      }
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