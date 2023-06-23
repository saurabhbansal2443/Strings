public class containsNumber {
    public static void main(String[] args) {
        
        String str = "9891293304";
        boolean ans = check(str);

        System.out.println(ans);

    }

    public static boolean check(String str){

        boolean flag = true ;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if( ch<'0' || ch>'9'){
                flag = false;
                break;
            }
        }

        return flag;
    }
}
