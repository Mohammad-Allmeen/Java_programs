/*
Quick sort algo works on the principle of divide and conquer algorithm
Pivot element is selected in Quick sort

Then all the elements smaller then pivot is arranged on the left side and the larger on is arranged on the right
The pivot element can be selected in four ways 
1. Random element
2. Median of the array 
3. First element
4. Last Element

Initially the pivot element is taken as -1 as there is no element currently which is smaller than pivot
Basically at every level we are fincding the exact position of the pivot element

Worst case of time complexity is when the pivot element is the largest or the smallest value

time complexity is 

Worst Case- O(n^2)
Average Case- O(n logn)

However is the majority cases quick sort is preferred as you are not making extra array like in merge sort to store the array

*/

public class Sort_Quick {
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high]; // last number of the array taken as pivot element
        int i= low-1; // to track the elements before pivot and as till now there is no element less than pivot element 
    
        for (int j = low; j < high; j++) {
            if(arr[j]< pivot){ // checking the array element is less than the pivot element
                i++;
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp= arr[i];
        arr[i]= arr[high];
        arr[high]= temp;

      return i;
    }
   public static void quickSort(int arr[], int low, int high){
    if(low<high){
        int pivotidx= partition(arr, low,high);

        quickSort(arr, low, pivotidx-1);
        quickSort(arr, pivotidx+1, high);
    }
   }

    public static void main(String[] args){
        int arr[]= {5,3,2,4,8,9,0,1};

        quickSort(arr, 0, 7);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
