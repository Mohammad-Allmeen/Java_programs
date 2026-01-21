public class Subset_check {

    public static boolean subset(int arr1[], int arr2[]){
      boolean visited[]= new boolean[arr1.length];
      int count=0;

      if(arr1.length<=arr2.length){
        for (int i = 0; i < arr1.length; i++) {
            boolean check= false;
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                  check=true;
                  visited[i]=true;
                  break;
                }
            }
            if(!check){
                return false;
            }
        }
      }
        
        for (int i = 0; i < visited.length; i++) {
            if(visited[i]==false){
                return false;
            }
        }

        return true;

    }
    public static void main(String [] args){
        
    int arr1[]={1,3,4,5,2};
	int arr2[]={0,4,3,1,7,5,15};
   
    boolean check =subset(arr1, arr2);
    if(check){
        System.out.println("Yes");
    }else{
        System.out.println("No, it's not");
    }
    }
}

/*
 * if(arr1.length<=arr2.length){
            for (int i = 0; i < arr1.length; i++) {
               boolean check= false;
                for (int j = 0; j < arr2.length; j++) {
                    if(arr1[i]==arr2[j]){
                       check= true;
                       visited[i]=true;
                        break;
                    }
                }
                if(!check){
                    System.out.println("No subset");
                    return false;
                }
            }
        }
 */