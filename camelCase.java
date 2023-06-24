public class camelCase {
    public static void main(String[] args) {
        String str = "Hello in the world of java";

        // output => helloInTheWorldOfJava

        String ans = methodOne(str);
        String ans2 =methodTwo(str);

        System.out.println(ans2);
    }

    // first method using split function

    public static String methodOne(String str){

        if(str.length()==0){
            return "";
        }else if (str.length()==1){
            return str;
        }
        String ans = "";
        String[] arr = str.split(" ");

        String firstWord=arr[0];
        char fc  =  firstWord.charAt(0);

        if(fc>='A' && fc<='Z'){
            fc=(char)(fc-'A'+'a');
            firstWord=fc+firstWord.substring(1);
        }

        ans+=firstWord;

        for(int i=1;i<arr.length;i++){
            String temp = arr[i];
            char ch = temp.charAt(0);

            if(ch>='a' && ch<='z'){
            ch=(char)(ch-'a'+'A');
            temp = ch + temp.substring(1);
             }

        ans+=temp;
        }

        return ans ;

    }

    public static String methodTwo(String str){
       if(str.length()==0){
            return "";
        }else if (str.length()==1){
            return str;
        }



        String ans = "";
        char fc = str.charAt(0);

        if(fc>='A' && fc<='Z'){
            fc=(char)(fc-'A'+'a');
        }
        ans+=fc;

        for(int i=1;i<str.length();i++){

            char curr = str.charAt(i);
            char pre = str.charAt(i-1);

            if(pre==' '){
                if(curr>='a' && curr<='z'){
                curr=(char)(curr-'a'+'A');
               }
               ans+=curr;
            }else if(curr!=' '){
                ans+=curr;
            }
        }

        return ans ;
    }
}
