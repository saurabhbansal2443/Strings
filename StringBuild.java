public class StringBuild {
    public static void main(String[] args) {
        String str = "Hello";

        StringBuilder sb = new StringBuilder(str); // this is converting string to sb 

        StringBuilder sb1 = new StringBuilder(); // empty string builder 
    
         // append is used to add the character in sb

         //sb.append('c');

         // insert 

         //sb.insert(1,'H');

         // delete

         //sb.delete(1, 2);

         // to remove single character 

         //sb.deleteCharAt(2);

         // replace a string 

         //sb.replace(1, 3, "World");

        //StringBuilder rev= new StringBuilder(sb.toString()).reverse();

        //char ch = sb.charAt(0);

        //int l = sb.length();

        //String sub = sb.substring(1, 4);

        sb.setCharAt(2, 'Z');

         System.out.println(sb);

    }
}
