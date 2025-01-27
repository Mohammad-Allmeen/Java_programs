class Max_product_pair{
    public static void main(String[] args){
        int arr[] = {1, 20, -10, -30, 50, 2, 60,3};
        int pro=1;
        int first=0;
                int sec= 0;
                int temp=1;
                int pro_final=1;
        for (int i = 0; i < arr.length-1; i++) {
           for (int j = i+1; j < arr.length; j++) {
            temp= arr[i]*arr[j];
            if(temp>pro){
                sec=arr[j];
            }
            pro= Math.max(pro,temp);
            
        }
        if(pro_final< pro){
            pro_final=temp;
            first= arr[i];
          
       } 
        pro_final= Math.max(pro_final, pro);
       
        }
        System.out.println(pro_final);
      System.out.println(first+" "+sec);

    }
}