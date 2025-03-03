/* 
arr[]= {1,7,0,3,5,6,0,3,0,2}

output= arr[]= {1,7,3,5,6,3,2,0,0,0}

*/

public class Zero_at_end {
    public static int [] zero_at_last (int arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
          count++;
            }
        }
        int arr1[]= new int[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
             arr1[j]=arr[i];
             j++;
            }
        }

        for (int i = j+1; i < arr1.length; i++) {
            arr1[i]=0;
        }
   return arr1;
    }

    public static String [] zero_at_last (String arr[]){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("0")){
          count++;
            }
        }
        String arr1[]= new String[arr.length];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].equals("0")){
             arr1[j]=arr[i];
             j++;
            }
        }

        for (int i = j; i < arr1.length; i++) {
            arr1[i]="0";
        }
   return arr1;
    }
    public static void main(String[] args){
        int arr[]= {1,7,0,3,5,6,0,3,0,2};
        int arr_ans[]= zero_at_last(arr);
        for (int i = 0; i < arr_ans.length; i++) {
            System.out.print(arr_ans[i]+" ");
        }

            // if input is given in String numbers
            String s= "1 2 4 0 2 8 0";
        String str_arr[]= s.split(" ");
        String ans[]= zero_at_last(str_arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
