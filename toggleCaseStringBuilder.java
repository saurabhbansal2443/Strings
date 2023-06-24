public class toggleCaseStringBuilder {
    public static void main(String[] args) {
        String str = "CoDing thINKer";

        String ans = toggle(str);
        System.out.println(ans);
    }

    public static String toggle(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 'a' + 'A');

            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            }

            sb.append(ch);
        }

        String ans = sb.toString();

        return ans ;
    }
}
