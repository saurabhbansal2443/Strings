public class removeDuplicate {
    public static void main(String[] args) {
        String str = "hhheeelllteee";

        String ans2 = remove(str); // helte

        System.out.println(ans2);

    }

    public static String remove(String str) {
        String ans = "" + str.charAt(0);

        for(int i=1 ; i<str.length();i++){
            char pre = str.charAt(i-1);
            char curr = str.charAt(i);

            if(curr!=pre){
                ans+=curr;
            }
        }

        return ans ;
    }

}
