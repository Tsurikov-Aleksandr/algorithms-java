package leet75;

public class T75Leet443StringCompression {
    public int compress(char[] chars) {
        int point = 0;
        char last = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == last) {
                count++;
            } else {
                chars[point] = last;
                point++;
                last = chars[i];
                if (count > 1) {
                    String number = String.valueOf(count);
                    for (char q : number.toCharArray()) {
                        chars[point] = q;
                        point++;
                    }
                }
                count = 1;
            }
        }

        chars[point] = last;
        point++;

        if (count > 1) {
            String number = String.valueOf(count);
            for (char q : number.toCharArray()) {
                chars[point] = q;
                point++;
            }
        }

        return point;

    }
}
