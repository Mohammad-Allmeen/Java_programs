public class IntegerToArray {
    // Method to convert every integer into Array

    public static void integerToArray(int n){
        int count=0;
        int n1= n;
        while(n!=0){
            n/=10;
            count++;
        }

        int arr[]= new int[count];
        int input=count;
        while (n1!=0) {
            int rem= n1%10;
            arr[n-1]= rem;
            input--;
            n1/=10;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String [] args){
        int n =654321;
        integerToArray(n);
    }
}
