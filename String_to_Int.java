// Normal variable are created in stack and and as String are immutable for every change in the string a new String will be created 
// Whereas in StringBuilder the stack will point to the same String object and if any modificatuon are done it will be added to that string 
//it will not create new String this process is safe the time which is very efficient and useful technique for large String based projects

public class String_to_Int {
    public static void main(String[] args){
        String str= "45678";
        int val= Integer.parseInt(str); // Function to convert String into Integer
        
        int calc= (int)Math.pow(val, 2);
        System.out.println(calc);

        String st= "Ahello";
        int i= (int) st.charAt(0); //step to get the ASCII value of any variable
        System.out.println(i);


        // compareTo function in the String
       // +ve value: if the string 1 first disimilar character(eg: h)is is greater than the string 2 first disimilar character (eg: e)
       // -ve value: if the string 1 first disimilar character(eg: e)is is lesser than the string 2 first disimilar character (eg: h)
       // 0 value : if the both the strings are same similar or identical
        String a1= "Hello";
        String a2= "Cello";
        System.out.println(a1.compareTo(a2)); //5 as ascii value of H is 72 and of C is 67 so 72-67=5

        // What if you use == this wil return similar and work for the primitive datatype but if the value are store in the non-primitive datatype and value are same 
        // then it will return not equal no matter if the value or string are equal because the non-primitive datatype are stored in different location that is in the heap memory 

        //EXAMPLE

        if(new String("Allmeen")== new String("Allmeen")){
            System.out.println("String are equal");
        }else{
            System.out.println("String are not equal"); // Output you will get as Strings are not equal as the String are stored by the non primitive datatype which is store as the object in the heap memory 
        }
        }
    }

