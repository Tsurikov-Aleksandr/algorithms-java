package top150.arraystring;

public class T18Leet12IntegerToRoman {
    public static String intToRoman(int num) {
        StringBuilder romanNumber = new StringBuilder();
        while (num > 0) {
            if (num >= 1000) {
                num -= 1000;
                romanNumber.append('M');
            } else if (num >= 900) {
                num -= 900;
                romanNumber.append('C');
                romanNumber.append('M');
            } else if (num >= 500) {
                num -= 500;
                romanNumber.append('D');
            } else if (num >= 400) {
                num -= 400;
                romanNumber.append('C');
                romanNumber.append('D');
            } else if (num >= 100) {
                num -= 100;
                romanNumber.append('C');
            } else if (num >= 90) {
                num -= 90;
                romanNumber.append('X');
                romanNumber.append('C');
            } else if (num >= 50) {
                num -= 50;
                romanNumber.append('L');
            } else if (num >= 40) {
                num -= 40;
                romanNumber.append('X');
                romanNumber.append('L');
            } else if (num >= 10) {
                num -= 10;
                romanNumber.append('X');
            } else if (num >= 9) {
                num -= 9;
                romanNumber.append('I');
                romanNumber.append('X');
            } else if (num >= 5) {
                num -= 5;
                romanNumber.append('V');
            } else if (num >= 4) {
                num -= 4;
                romanNumber.append('I');
                romanNumber.append('V');
            } else {
                num--;
                romanNumber.append('I');
            }
        }

        return romanNumber.toString();
    }

    public static void main(String[] args) {
        int t1 = 3; // "III"
        int t2 = 58; // "LVIII"
        int t3 = 1994; // "MCMXCIV"
        System.out.println(intToRoman(t3));
    }
}
