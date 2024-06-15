package all.easy;

public class Easy415AddStrings {
    public String addStrings(String num1, String num2) {
        int point1 = num1.length() - 1;
        int point2 = num2.length() - 1;
        StringBuilder st = new StringBuilder(point1 > point2 ? point1 + 1 : point2 + 1);
        int next = 0;

        while (point1 >= 0 && point2 >= 0) {
            int n1 = num1.charAt(point1) - '0';
            int n2 = num2.charAt(point2) - '0';
            int cur = (n1 + n2 + next) % 10;
            next = (n1 + n2 + next) / 10;
            st.append(cur);
            point1--;
            point2--;
        }

        while (point1 >= 0) {
            int n1 = num1.charAt(point1) - '0';
            int cur = (n1 + next) % 10;
            next = (n1 + next) / 10;
            st.append(cur);
            point1--;
        }

        while (point2 >= 0) {
            int n2 = num2.charAt(point2) - '0';
            int cur = (n2 + next) % 10;
            next = (n2 + next) / 10;
            st.append(cur);
            point2--;
        }

        if (next != 0) {
            st.append(next);
        }

        st.reverse();

        return st.toString();
    }
}
