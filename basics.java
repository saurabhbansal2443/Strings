import java.util.Arrays;

public class basics{
    public static void main(String[] args) {
        //String str = "Hello";

        // length of the string 

        // int l = str.length();


        // character at specific index 

        //char ch = str.charAt(0);

        // substring 

        // String s= "typeWriter";
        // String sub1 = s.substring(4);
        // String sub2 = s.substring(4, 4);
        // System.out.println(sub2);

        // spilt method 

        String str = "Java is a language";

        String[] arr = str.split("a");

       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }
    }
}