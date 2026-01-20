/*
You are a programmer for a chef who writes recipes using two arrays • An array Q of size N with quantities 
(in grams) • An array I of size M with ingredient codes. The chef asked you to combine these two arrays into a single 
string, alternating between quantity and ingredient code, starting with the quantity. Your task is to find and return a
string value representing the decoded recipe by alternating quantities and ingredient codes.

Input Specification: 
inputt: An integer, value N, representing the size of the array Q 
input2: An integer array Q, representing the amount of each ingredient in grams. 
input3 : An integer value M, representing the size of the array I. 
input4: An integer array I, representing the ingredient codes.
 Output Specification: Return a string value representing the decoded recipe by alternating quantities and ingredient codes. 
 
 Example 1: input1 : 3 input2: (100,250,30) input3 : 3 input4 : (1,2,3) Output: 10050090
  Explanation: 
 Here, the array Q is (100,250,30) and the array lis (1,2,3). 
 We can find the decoded recipe as below: • 
 100g of ingredient 1 = 100 • 250g of ingredient 2 = 500 • 30g of ingredient 3 = 90 
 
 The final string will be 10050090'. Hence, 10050090 is returned as the output. 
 
 Example 2: input1: 5 input2 : (100,250,30,5, 10} input3 : 3 input4 : (1,2,3)
*/


public class ChefRecipe{

    public static String find(int n, int q[], int m, int i[]){
      String ans="";
      StringBuilder ans2= new StringBuilder();

        for(int j=0;j<n;j++){
            int mul= q[j]*i[j];
           ans+=mul+"";
           ans2= ans2.append(mul);
        }

        System.out.println(ans2.toString());
   return ans;
    }
    public static void main(String[] args) {
        
        int n=3;
        int q[]= {100,250,30};

        int m=3;
        int i[]={1,2,3};

        System.out.println(find(n,q,m,i));
    }
}