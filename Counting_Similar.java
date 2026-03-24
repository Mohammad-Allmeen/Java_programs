public class Counting_Similar {
    public static void main(String[] args){
        int arr[]= {1,2,3,2,2};
        //int arr[]={4,4,4}; //Give output 0 as all are same 
        
        int count=0;
        for (int i = 0; i < arr.length-1; i++) {
          if(arr[i]==arr[i+1]){
            count++;
          }  
        }

        if(count==(arr.length-1)){
            System.out.println("0");
        }else{
            int n= arr.length-count;
            System.out.println(n);
        }
    }
}
