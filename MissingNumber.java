public class MissingNumber {

    public static int find(int arr[]) {
        
        boolean check=false;
        for (int i = 0; i < arr.length + 1; i++) {
            check=false;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    check=true;
                }
            }
            if(check==false){
                System.out.println(i);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        
         int arr[]= {0,1,2,4,5};
         find(arr);
        
    }
}
