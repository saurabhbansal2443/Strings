import java.util.Arrays;

public class secondFrequent {
    public static void main(String[] args) {
        String str = "helllo ghiiIIIii lLLLAhfjllllll";

        char ans = calculateFrequency(str);

        System.out.println(ans);

    }

    public static char calculateFrequency(String str) {

        int[] fre = new int[26];
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch>='a' && ch<='z'){
                int idx = (int)(ch-'a');
                fre[idx]=fre[idx]+1;
            }else if(ch>='A' && ch<='Z'){
                int idx = (int)(ch-'A');
                 fre[idx]=fre[idx]+1;
            }
        }
        int max = 0 ;
        int smax = 0 ;

        for(int i=0;i<26;i++){

            if(fre[max]<fre[i]){
                smax = max ;
                max = i ;
            }else if ( fre[smax]<fre[i]){
                smax = i ;
            }
        }
        char ans = (char)('a'+smax);

        return ans;
        }
        
    }

