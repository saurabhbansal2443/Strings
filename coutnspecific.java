public class coutnspecific {
    public static void main(String[] args) {
        String str = "Hello in the world ";

        char k = 'l';

        int count = 0 ;

        for(int i=0 ; i<str.length();i++){

            char ch = str.charAt(i);

            if(ch==k){
                count++;
            }
        }

        System.out.println(count);
    }
}
