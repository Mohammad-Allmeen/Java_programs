import java.util.*;

public class Remove_duplicate {

  
//Method for removing the duplicates in the Integer Array by using LinkedHashSet as it store unique value with order

  public static int [] duplicate(int arr[])
  {

 LinkedHashSet<Integer> set = new LinkedHashSet<>();
 for(int num: arr){
  set.add(num);
 }
  int index=0;
  int arr1[] = new int[set.size()];
  for (int i : set) {
    arr1[index++]= i;
  }
  return arr1 ;
}

//Second Method by Brute force

public static int [] remove_duplicate(int arr[]){

    int len = arr.length;
    int temp[]= new int[len];
     int count=0;
    for (int i = 0; i < len; i++) {
      boolean isDup = false;
      for (int j = 0; j <count; j++) {
        if(arr[i]==arr[j] && i!=j){
            isDup=true;
            break;
        }
      }
      if(!isDup){
        temp[count]= arr[i];
        count++;
      }  
    }

    int finalResult[] = new int[count];
    for (int i = 0; i < count; i++) {
        finalResult[i]= temp[i];
    }
    return finalResult;
}

//Method for removing duplicate in the String by LinkedHashSet

public static String [] duplicateString(String arr[])
  {

  LinkedHashSet<String> set= new LinkedHashSet<>();

  for (String it: arr){
    set.add(it);
  }

  String result[] = new String[set.size()];
  int count=0;
  for(String str: set){
   result[count]= str;
   count++;
  }
  return result;
  }



  // Second method for removing the duplicate in the String 

  public static String[] stringDuplicate(String arr[]){

int len= arr.length;
int count=0;
String temp[] = new String[len];
for (int i = 0; i < len; i++) {
  boolean check = false;
  for (int j = 0; j < count; j++) {
    if(arr[i].equals(temp[j])){
      check= true;
      break;
    }
  }
  if(!check){
    temp[count]=arr[i];
    count++;
  }
}

String finalResult[]= new String[count];
for (int i = 0; i < finalResult.length; i++) {
  finalResult[i]= temp[i];
  System.out.print(temp[i]+ " ");
}
return finalResult;
  }


  public static void main(String[] args) {
    int n = 9;
    int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };

    int arrAns[]= duplicate(arr);

    for (int i = 0; i < arrAns.length; i++) {
        System.out.print(arrAns[i]+" ");
    }


    //second method calling 
   int finalResult[]= remove_duplicate(arr);
    System.out.println("The result of the second method is "+ Arrays.toString(finalResult) );

   System.out.println();
    // method for removing the duplicate String

    String str="today is a fabulous day today";

    String strArr[]= str.split(" ");
    String result[]=duplicateString(strArr);
    System.out.println("The result of removing duplicate in the String by using LinkedHashSet is : " + Arrays.toString(result));

    System.out.println();
    String dupRemove[]= stringDuplicate(strArr);
    System.out.println();
    System.out.println("The result of removing duplicate String by Brute force method is : " +Arrays.toString(dupRemove));


  }
}








