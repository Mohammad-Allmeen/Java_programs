

public class DominantNumber {

    public static int functionMax(int arr[]){
      int c=1;
      for (int i = 1; i < arr.length; i++) {
        boolean b=true;
        for (int j = 0; j<i; j++) {
            if(arr[i]<arr[j]){
              b=false;
              break;
            }
        }
        if(b==true){
            c++;
        }
      }
        return c;
    }
    public static void main(String[] args) {
        
        //int arr[] =  {7, 4, 8, 2, 9};
        int arr[] =  {3, 4, 5, 8, 9};
        System.out.println(functionMax(arr));
    }
}


