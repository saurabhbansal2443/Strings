public class removeDuplicate {
    public static void main(String[] args) {
        String str = "hhheeelllteee";
     
        //String ans = remove(str); // helte

        String ans2= removeAllDuplicates(str); // helt

        System.out.println(ans2);

    }

    public static String remove(String str){

        String ans ="";

        ans+=str.charAt(0);

        for(int i=1;i<str.length();i++){
            char curr=str.charAt(i);
            char pre=str.charAt(i-1);

            if(pre!=curr){
                ans+=curr;
            }
        }

        return ans;
    }

    public static String removeAllDuplicates(String str){
        String ans = "";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            boolean flag = true;

            for(int j=0;j<ans.length();j++){
                char ch2=ans.charAt(j);
                if(ch==ch2){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                ans+=ch;
            }

            

        }
        return ans;
    }
}
