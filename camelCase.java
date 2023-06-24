public class camelCase {
    public static void main(String[] args) {
        String str = "Hello in the world of java";

        // output => helloInTheWorldOfJava

        String ans = methodOne("");

        System.out.println(ans);
    }

    // first method using split function

    public static String methodOne(String str){

        if(str.length()==0){
            return "";
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
}
