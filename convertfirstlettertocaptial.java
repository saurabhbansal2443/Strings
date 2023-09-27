public class convertfirstlettertocaptial {
    public static void main(String[] args) {
        String str = "Hello in the World of java";

        String ans = method2(str);

        System.out.println(ans);

    }

    public static String method1(String str) {

        String ans = "";

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {

            String s = arr[i];

            char fc = s.charAt(0);

            if (fc >= 'A' && fc <= 'Z') {
                ans += s + " ";
            } else {
                // lc - 'a' = uc - 'A';

                fc = (char) (fc - 'a' + 'A');

                String rem = "" + fc;

                for (int j = 1; j < s.length(); j++) {
                    rem += s.charAt(j);
                }

                ans += rem + " ";

            }
        }

        return ans ;

    }

    public static String method2(String str){

        String ans = "";
        char fc = str.charAt(0);
        // lc - 'a ' = uc - 'A'
        if(fc>='a' && fc<='z'){
            fc = (char)(fc-'a' + 'A');
        }

        ans+=fc;

        for(int i=1 ; i<str.length();i++){
            char pre = str.charAt(i-1);
            char curr = str.charAt(i);

            if(pre==' ' && curr>='a' && curr<='z'){
                curr = (char)(curr-'a' + 'A');
            }

            ans+=curr;
        }

        return ans ;
    }
}
