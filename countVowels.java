public class countVowels {
    public static void main(String[] args) {

        String str = "hello to the world ";

        int ans = countVowel(str);

        System.out.println(ans);
    }

    public static int countVowel(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;

    }
}
