public class longestWord {
    public static void main(String[] args) {
        String str = "Hello in the worlddd of Javaaaaaaaaaa";

        int ans = methodTwo(str);

        System.out.println(ans);

    }

    public static int methodone(String str){

        String[] arr = str.split(" ");

        int max = 0;

        for(int i=0;i<arr.length;i++){
            String temp = arr[i];

            int tempLength = temp.length();

            max = Math.max(max,tempLength);
        }

        return max;
    }

    public static int methodTwo(String str){

        int max =0;

        int tempCount=0;

        for(int i=0;i<str.length();i++){

            char ch = str.charAt(i);

            if(ch!=' '){
                tempCount++;
            }else{
                max=Math.max(max,tempCount);
                tempCount=0;
            }
        }
         max=Math.max(max,tempCount);
        return max;
    }
}
