public class convertFirstLetterToUpperCase {
    public static void main(String[] args) {
        String str = "Hello in the world of java ";

        String ans = convert(str);

        System.out.println(ans);


    }


    // first method using split function 

    public static String convert(String str){

        String[] arr= str.split(" ");

        String ans = "";

        for(int i=0;i<arr.length;i++){
            String temp = arr[i];
            char ch = temp.charAt(0);
           

            if(ch>='a' && ch<='z'){
                ch =  (char)(ch -'a' + 'A');
                String rem = temp.substring(1);
                rem= ch + rem;
                ans +=rem+" ";
            }else{
                ans +=temp+" ";
            }
        }

        return ans ;
    }

    public static String convert2(String str){
        String ans = "";
        char fc = str.charAt(0);
        if(fc>='a' && fc<='z'){
            fc = (char)(fc-'a'+'A');    
        }
        ans+=fc;
        for(int i=1;i<str.length();i++){
            char curr = str.charAt(i);
            char pre = str.charAt(i-1);

            if(pre==' '){
                if(curr>='a' && curr<='z'){
                curr = (char)(curr-'a'+'A');    
              }
            }
            ans+=curr;
        }
        return ans ;
    }
}
