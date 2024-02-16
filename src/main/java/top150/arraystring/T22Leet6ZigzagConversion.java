package top150.arraystring;

public class T22Leet6ZigzagConversion {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] rowSB = new StringBuffer[numRows];

        for (int i = 0; i < rowSB.length; i++) {
            rowSB[i] = new StringBuffer();
        }

        int index = 0;
        while (index < len) {
            for (int i = 0; i < numRows && index < len; i++) { // вертикально вниз
                rowSB[i].append(c[index]);
                index++;
            }
            for (int i = numRows - 2; i >= 1 && index < len; i--) { //с наклоном вверх
                rowSB[i].append(c[index]);
                index++;
            }
        }
        for (int i = 1; i < rowSB.length; i++) {
            rowSB[0].append(rowSB[i]);
        }
        return rowSB[0].toString();
    }
}
