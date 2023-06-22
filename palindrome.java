public class palindrome {
    public static void main(String[] args) {
        String str = "radar";

        boolean ans = checkPalindrome(str);

        System.out.println(ans);
    }

    public static boolean checkPalindrome(String str){

        int start = 0;
        int end = str.length()-1;

        boolean flag = true;

        while(start<end){
            char s=str.charAt(start);
            char e=str.charAt(end);

            if(s!=e){
                flag = false;
                break;
            }

            start++;
            end--;
        }

        return flag;
    }
}
