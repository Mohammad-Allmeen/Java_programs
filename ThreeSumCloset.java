import java.util.*;

class ThreeSumCloset{
    public static int threeSumCloset(int [] nums, int target){
        int len= nums.length;
        Arrays.sort(nums);
        int sumCloset=0;
        sumCloset=nums[0]+ nums[1]+nums[2];
        for(int i =0; i<len;i++){
         int j=i+1;
         int k=len-1;
         
         while (j<k){
            int currentSum= nums[i]+ nums[j]+nums[k];
            if(Math.abs(target-sumCloset)> Math.abs(target-currentSum)){
                sumCloset= currentSum;
            }
            if(target>currentSum){
                j++;
            }else if(target<currentSum){
                k--;
            }else{
                return currentSum;
            }
         }
        }
        return sumCloset;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the number of element in the array");
        int n= sc.nextInt();
        int nums[]= new int[n];

        for (int i = 0; i < nums.length; i++) {
            nums[i]= sc.nextInt();
        }
        System.out.println("Enter the target element");
        int target = sc.nextInt();
        int sum= threeSumCloset(nums, target);
        System.out.println("The sum closet is "+ sum);
        

    }
}