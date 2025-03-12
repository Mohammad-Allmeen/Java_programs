public class Rotate_element_right {

    public static void rotate_element_right(int arr[]){
    int len= arr.length;
    int seclast=arr[len-2];
    int last= arr[len-1];
    int arrans[]= new int[len];
    int n=2;
    for (int i = 0; i < arr.length-2; i++) {
       arrans[n++]= arr[i]; 
    }
    arrans[0]=seclast;
    arrans[1]=last;
    for (int i = 0; i <arrans.length; i++) {
      System.out.print(arrans[i]+" ");
     }
    }
    public static void main(String args[]){
        int arr[]= {11,12,13,14,15,16,18};
        System.out.println(arr.length);
        
        rotate_element_right(arr);
        //System.out.println(arr[arr.length-2]);
    }
}
