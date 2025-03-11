public class Rotate_element_array {
    public static void main(String[] args){
        int arr[]= {11,12,13,14,15,16,18};
        System.out.println(arr.length);
        int e1= arr[0];
        int e2= arr[1];
        int arrans[]= new int[arr.length];
        int n=0;
        for (int i = 2; i < arr.length; i++) {
            arrans[n++]= arr[i];
        }
        arrans[arr.length-2]=e1;
        arrans[arr.length-1]=e2;
        for (int i = 0; i < arrans.length; i++) {
            System.out.print(arrans[i]+"  ");
        }
       int l=arr.length;
       int mid= l/2;
       int median=0;
        if(l%2==0){
            median= (arr[mid-1]+arr[mid])/2;
            System.out.println("Median is "+ median);
        }
        else{
           System.out.println(arr[mid]); 
        }
       
    }
}
