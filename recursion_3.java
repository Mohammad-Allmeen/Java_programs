public class recursion_3 {

    public static void permutation(String str, String permutation){

        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
   
        for (int i = 0; i < str.length(); i++) {
            char currChar= str.charAt(i);
            String newStr= str.substring(0, i)+str.substring(i+1);
            permutation(newStr, permutation+currChar);
        }
    }

// Recursive code to find all the path in maza to move from matrix 0,0 to m,n where you can only move to either right or downward direction

public static int countPath(int i, int j, int m, int n){

    //base case
    if(i==m || j==n){
        return 0;
    }

    if(i==m-1 || j==n-1){
        return 1;
    }

    int downpath= countPath(i+1, j, m, n);

    int rightPath= countPath(i, j+1, m, n);

return downpath+rightPath;

}

// Recursive code to find total ways to place a tiles in the the size m*n where the size of tiles is 1*m

public static int placeTiles(int n, int m){

    if(n==m){
        return 2;
    }
    if (n<m){
        return 1;
    }

    int vertically = placeTiles(n-m, m);

    int horizontally= placeTiles(n-1, m);

    return vertically+horizontally;
} 
    public static void main(String[] args){

// Recursive code to find permutation 
    permutation("abc", "");

// Recursive code to find all the path in maza to move from matrix 0,0 to m,n where you can only move to either right or downward direction

int totalPath=countPath(0,0,3,3);
System.out.println(totalPath);


// Recursive code to find total ways to place a tiles in the the size m*n where the size of tiles is 1*m

System.out.println("The number of ways to place the tiles is "+ placeTiles(4,3)); // when n==4, the ans is 2 and if n<m then ans is 1


    }
}
