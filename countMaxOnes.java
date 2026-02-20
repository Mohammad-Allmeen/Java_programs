public class countMaxOnes {
     
    public static int findMaxOnes(int arr[][],int r, int c){
        int max= Integer.MIN_VALUE;
        int row=0;
        int count;
       for (int i = 0; i <r; i++) {
        count=0;
       for (int j = 0; j < c; j++) {
        if(arr[i][j]==1){
           count++;
        }
       }
          if(count>max){
            max=count;
            row=i;            
        }
       }
        return row;
    }
    public static void main(String[] args) {

        int arr[][]= {{0,1,0,0},{1,1,1,0},{1,1,1,1},{0,1,1,0}};
       System.out.println(findMaxOnes(arr, 3,4)); 
    }
}
