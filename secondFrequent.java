import java.util.Arrays;

public class secondFrequent {
    public static void main(String[] args) {
        String str = "helllo ghiiIIIii lLLLAhfjllllll ghdvshdufdhqDFEWHGDgdjhqsbdjhqw";

        char ans = calculateFrequency(str);


    }

    public static char  calculateFrequency(String str){

        int[] fre = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            

            if(ch>='a' && ch<='z'){
                int idx=(int)(ch-'a');
                fre[idx]=fre[idx]+1;
            }else if(ch>='A' && ch<='Z'){
                  int idx=(int)(ch-'A');
                fre[idx]=fre[idx]+1;
            }
        }

        System.out.print(Arrays.toString(fre));

        return 'a';
    }
}
