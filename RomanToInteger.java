public class RomanToInteger 
{
    public static int getValue(char ch){
        switch (ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 0;
        }
    }
    public static int romanToInt(String s) 
    {
        int len= s.length();
        int sum=0;
        for (int i = 0; i < len; i++) {
            int v= getValue(s.charAt(i));
            if(i+1<len &&v>= getValue(s.charAt(i+1))){
                 sum=sum+v;
            } else{
                sum= sum-v;
            }
        }
      return sum;
    }
    public static void main(String[] args){
        String roman= "XVIMC";
        int sum= romanToInt(roman);
        System.out.println(sum);

    }
}

/* 
int n= s.length();
int sum=0;
for(int i=0;i<n;i++)
{
int value= getValue(s.charAt(i));
if((i+1)<n && value>=getValue(s.charAt(i+1)))
{
    sum=sum+value;
}
else
{
    sum=sum-value;
}
} 
return sum;

*/
