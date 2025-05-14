public class Recursion_2 {

    public static void moveString(String str, int idx, String newStr, int count){
     
        if(idx==str.length()){
            for (int i = 0; i<count; i++) {
                newStr+="x";
            }
            System.out.println(newStr);
            return; 
        }

        if(str.charAt(idx)!='x'){
        newStr+=str.charAt(idx);
        moveString(str, idx+1 , newStr, count);
        }
        else{
            count++;
            moveString(str, idx+1, newStr, count);
        }
    }
    public static void main(String[] args){

    // Recursive method to move all the x value in the end

    String str= "abxxcxd";
    String newStr="";
    moveString(str, 0, newStr,0);

    }
}
