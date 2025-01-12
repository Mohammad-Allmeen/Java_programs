public class Parenthesis_check {
    public static boolean isValid(String s) {
        while(s.contains("()") || s.contains("{}")|| s.contains("[]"))
        {
       s= s.replace("()", "");
       s= s.replace("{}", "");
       s= s.replace("[]", "");
        }
        return s.isEmpty();
            }
            public static void main(String [] args){
                String s= "[()]{}";
                boolean check = isValid(s);
                if(check){
                    System.out.println("Valid Parenthesis");
                }
                else{
                    System.out.println("Not a Valid Parenthesis");
                }
            }
}
