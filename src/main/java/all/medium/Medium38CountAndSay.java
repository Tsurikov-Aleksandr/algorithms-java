package all.medium;

public class Medium38CountAndSay {

    public static String countAndSay(int n) {
        String st = "1";

        for (int i = 1; i < n; i++) {
            st = runLengthEncoding(st);
        }
        return st;
    }

    private static String runLengthEncoding(String s) {
        StringBuilder sb = new StringBuilder();
        char number = s.charAt(0);
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == number) {
                count++;
            } else {
                sb.append(count);
                sb.append(number);

                number = s.charAt(i);
                count = 1;
            }
        }

        sb.append(count);
        sb.append(number);

        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
