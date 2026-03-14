// Find the Number where every number to its left is smaller and to its right is greater

public class EquilibriumPosition {

    public static int findFunction(int arr[]){
        boolean check1=false,check2=false;
        for (int i=1; i<arr.length;i++){
             check1 =true;
            for (int j=0;j<i;j++){
            
                if(arr[j]>=arr[i]){
                    check1 =false;
                    break;
                }
            }
              check2=true;
            for(int k=i+1;k<arr.length;k++){
                if(arr[k]<=arr[i]){
                    check2=false;
                    break;
                }
            }
            if(check1==true && check2==true ){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
         int arr[] =  {3, 2, 9, 8, 12, 14, 13};

         System.out.println(findFunction(arr));
    }
}
