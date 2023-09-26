import java.util.Arrays;

public class longestWord {
    public static void main(String[] args) {
        String str = "Hello in the worlddd of Javaaaaaaaaaa";

        int ans = methodTwo(str);

        System.out.println(ans);

    }

    public static int methodone(String str) {
        String[] arr = str.split(" ");

        int max = 0;

        // System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            String temp = arr[i];

            if (max < temp.length()) {
                max = temp.length();
            }
        }

        return max;
    }

    public static int methodTwo(String str) {
        int max = 0 ;
        int currlength = 0 ;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch!=' '){
                currlength++;
            }else {
                max = Math.max(max,currlength);
                currlength=0;
            }
        }

         max = Math.max(max,currlength);

        return max ;
    }
}
