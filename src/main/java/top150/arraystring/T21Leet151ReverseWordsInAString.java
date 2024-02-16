package top150.arraystring;

public class T21Leet151ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder s2 = new StringBuilder();
        for (String st : arr) {
            if (!st.isEmpty()) {
                s2.insert(0, st);
                s2.insert(0, " ");
            }
        }
        String answer = s2.toString();
        answer = answer.strip();
        return answer;
    }

    public static void main(String[] args) {
        String t1 = "a good   example";
        System.out.println(reverseWords(t1));
    }
}
