public class reverse {
   public static void main(String[] args) {
    String str = "Hello";

    String res = reverse(str);

    System.out.println(res);

   } 

   public static String reverse(String str){

      String ans ="";

      for(int i=str.length()-1;i>=0;i--){
         char ch = str.charAt(i);
         ans += ch;
      }

      return ans ;


   }
}
