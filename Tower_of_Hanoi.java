// Time complexity of this code will come as - 
/*
 * T(n) = 2ⁿ − 1
 * Time Complexity: Big O(2^n)

Why O(2ⁿ)? Let's break it down

For n disks, the recursive function does the following:

Move n-1 disks from source to auxiliary → T(n-1)

Move the largest disk from source to destination  → 1 move

Move n-1 disks from auxiliary to destination → T(n-1)
 */

public class Tower_of_Hanoi {

    public static void recursive_function(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transferred disk"+ n+ " from "+ src + " to " + dest );
            return; 
        }
        recursive_function(n-1, src, dest, helper); // using destination as helper and tranferring the disk from src to helper
        System.out.println("Transferred disk"+ n+ " from "+ src + " to " + dest );
        recursive_function(n-1, helper, src, dest); //  using src as helper and tranferring the disk from helper to detination
    }
    public static void main(String[] args){
        System.out.println("Tower of Hanoi program");
        int n=3;
        recursive_function(n,"S", "H", "D" );
    }
}

