public class Frequency_sorting {

    public static void sorting(int arr[]){
        boolean visited[]= new boolean[arr.length];
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(visited[i]==false){
                count=1;
                for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
                }
                

            }
            
        }
    }
    public static void main(String [] args){

    }
}
