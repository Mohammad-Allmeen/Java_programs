import java.util.Arrays;

public class Second_largest {
    public static void main(String []args ){
        int arr[]={1,2,3,4,5,6};
        int max = arr[0];
        Arrays.sort(arr);// 1st Method by sorting and finding the second last index value
        System.out.println(arr[arr.length-2]);

       // 2nd Method
        for(int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }

        int secondMax= Integer.MIN_VALUE;
        for (int j=0;j<arr.length;j++){
            if(arr[j]!=max&& arr[j]>secondMax){
                secondMax=arr[j];
            }
        }
        if (secondMax==max){
            System.out.println("no second maximum may be the numbers are same");
        }
        else
        {
            System.out.println("Second maximum number is "+secondMax);
        }
    }
    
}
