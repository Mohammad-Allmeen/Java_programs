public class Geometric_Progression {
    public static void main(String[] args){
        int n1= 2;
        int lt= 4;
        int n=10;
        for (int i = 0; i < n-2; i++) {
            int t= lt*2;
            lt=t;
        }
        System.out.println(lt);
    }
}
