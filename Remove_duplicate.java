import java.util.*;

public class Remove_duplicate {

  
//Method for removing the duplicates in the Integer Array by using HashSet

  public static int [] duplicate(int arr[])
  {

  LinkedHashSet<Integer> set = new LinkedHashSet<>();

 for(int num : arr){
    set.add(num);
 }
 int index=0;
 int result[] = new int[set.size()];
 for(int num: set){
    result[index]=num;
    index++;
 }
 Arrays.sort(result);
  return result;
  }

//Second Method by brute force

public static int [] remove_duplicate(int arr[]){
    int len= arr.length;
    int temp[]= new int[len];
     int count=0;
     for (int i = 0; i <len; i++) {
        boolean isDup= false;
        for (int j = 0; j < count; j++) {
            if(arr[i]==temp[j])
            isDup= true;
            break;
        }
        if(!isDup){
            temp[count]= arr[i];
            count++;
        }
     }
     int finalResult[]= new int[count];
     for (int i = 0; i < count; i++) {
        finalResult[i]= temp[i];
     }
     Arrays.sort(finalResult);
    return finalResult;
}

//Method for removing duplicate in the String by LinkedHashSet

public static String [] duplicateString(String arr[])
  {

  LinkedHashSet<String> set= new LinkedHashSet<>();

  for(String str: arr){
    set.add(str);
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
    String temp[]= new String[len];
    int count=0;
    for (int i = 0; i < len; i++) {
        boolean isDup= false;
        for (int j = 0; j <count ; j++) {
            if(arr[i].equals(temp[j])){
                isDup= true;
                break;
            }
        }
        if(!isDup){
            temp[count]= arr[i];
            count++;
        }

    }
    
    String result[]= new String[count];
    for (int i = 0; i < count; i++) {
        result[i]= temp[i];
     }
    return result;
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


    // method for removing the duplicate String

    String str="today is a fabulous day today";

    String strArr[]= str.split(" ");
    String result[]=duplicateString(strArr);
    System.out.println("The result of removing duplicate in the String is : " + Arrays.toString(result));


    String dupRemove[]= stringDuplicate(strArr);
    System.out.println("The result of removing duplicate String by Second method is : " +Arrays.toString(dupRemove));


  }
}