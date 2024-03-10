package top150.arraystring;

public class T17Leet13RomanToInteger {
    public static int romanToInt(String s) {
        int number = 0;
        char last = 'I';
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'I') {
                if (last == 'V' || last == 'X') {
                    number--;
                } else {
                    number++;
                }
            }
            if (s.charAt(i) == 'V') {
                number += 5;
                last = 'V';
            }
            if (s.charAt(i) == 'X') {
                if (last == 'L' || last == 'C') {
                    number -= 10;
                } else {
                    number += 10;
                }
                last = 'X';
            }
            if (s.charAt(i) == 'L') {
                number += 50;
                last = 'L';
            }
            if (s.charAt(i) == 'C') {
                if (last == 'D' || last == 'M') {
                    number -= 100;
                } else {
                    number += 100;
                }
                last = 'C';
            }
            if (s.charAt(i) == 'D') {
                number += 500;
                last = 'D';
            }
            if (s.charAt(i) == 'M') {
                number += 1000;
                last = 'M';
            }
        }
        return number;
    }

    public static void main(String[] args) {
        String t1 = "III"; // 3
        String t2 = "LVIII"; // 58
        String t3 = "MCMXCIV"; //1994
        System.out.println(romanToInt(t3));
    }
}
