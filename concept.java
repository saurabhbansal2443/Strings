public class concept {
    public static void main(String[] args) {
        


        //Strings are made in string pool 

        String str1="Hello";//Strings are made in string pool 
        String str2="Hello";

        String str3=new String("Hello"); // this string is taking memory in heap 
        String str4=new String("Hello");

        // == operator always compares address as in reference data types  

        boolean ans1 = str1==str2; // true beacuse these strings are made in string pool and they share the same address
        boolean ans2 = str1==str3; // false as address are diffrent  
        boolean ans3 = str3==str4;  // false both the str3 and str4 are getting diffrent memory locations thats why it will give false 
        

        // using equlas function we first comapre the address and if the address is not same 
        // then it will check the content of the string character by character 

        boolean ans4 = str1.equals(str2);
        boolean ans5 = str1.equals(str3);
        boolean ans6 = str3.equals(str4);

        System.out.println(ans6);
    }
}
