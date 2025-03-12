import java.util.*;

public class Rotate_element_left {
public static void reverse(int arr[], int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

// Function to rotate the array left by d positions
public static void leftRotate(int arr[], int n, int d) {
   

    // Step 1: Reverse first d elements
    reverse(arr, 0, d - 1);

    // Step 2: Reverse remaining n-d elements
    reverse(arr, d, n - 1);

    // Step 3: Reverse the entire array
    reverse(arr, 0, n - 1);
}

public static void rotate_element_second_logic(int arr2[]){
    int e1= arr2[0];
    int e2= arr2[1];
    int arrans[]= new int[arr2.length];
    int n=0;
    for (int i = 2; i < arr2.length; i++) {
        arrans[n++]= arr2[i];
    }
    arrans[arr2.length-2]=e1;
    arrans[arr2.length-1]=e2;
    for (int i = 0; i < arrans.length; i++) {
        System.out.print(arrans[i]+"  ");
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input array size
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    // Input array elements
    System.out.println("Enter the array elements:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    // Input the number of positions to rotate left
    System.out.print("Enter the number of positions to rotate left: ");
    int d = sc.nextInt();

    // 1st Logic to Rotate the array left by d positions
    leftRotate(arr, n, d);

    // Print the rotated array
    System.out.println("Array after left rotation:");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }

           //2nd Logic of rotating the element
           int arr2[]= {11,12,13,14,15,16,18};
           System.out.println(arr2.length);
           
           rotate_element_second_logic(arr2);
}
}